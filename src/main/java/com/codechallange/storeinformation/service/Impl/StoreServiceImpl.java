package com.codechallange.storeinformation.service.Impl;

import java.util.Date;
import java.util.List;

import javax.management.ServiceNotFoundException;
import javax.naming.ServiceUnavailableException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.codechallange.storeinformation.exception.NoDataFoundException;
import com.codechallange.storeinformation.exception.ValidationException;
import com.codechallange.storeinformation.model.StoreDetails;
import com.codechallange.storeinformation.model.StoreVersionPeriod;
import com.codechallange.storeinformation.repository.StoreRepository;
import com.codechallange.storeinformation.service.StoreService;


@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
    private StoreRepository storeRepository;
	@Override
	public void createStore(StoreDetails storeDetails) {
		Date date = new Date();
		try {
			
			
			for (StoreVersionPeriod storeVersionPeriod : storeDetails.getStoreVersionPeriods()) {
				if(validate(storeVersionPeriod.getAddressCodeEan()) && storeVersionPeriod.getDateValidFrom().after(date))
				storeRepository.save(storeDetails);
			}
		}catch(ValidationException ex){
			throw ex;
		}
		
	}
	@Override
	public List<StoreDetails> getAllStores() {
		   return storeRepository.findAll();
	}
	
	 protected boolean validate(String codigoBarra) {
		 boolean valid;
	        if (!codigoBarra.matches("^[0-9]{13}$")) {
	        	valid = false;
	        }else {
	        	valid=true;
	        }
	       return valid;
	    }
	@Override
	public StoreDetails getStoresById(Integer id) {
		return storeRepository.findItemByName(id);
	}
	@Override
	public StoreDetails updateStore(StoreDetails storeDetails) {
		StoreDetails store = storeRepository.findItemByName(storeDetails.getId());
		
		try {

			if(store!=null) {
				for (StoreVersionPeriod storeVersionPeriod : store.getStoreVersionPeriods()) {
					if(validate(storeVersionPeriod.getAddressCodeEan()) && storeVersionPeriod.getDateValidFrom().after(new Date())) {
						storeRepository.delete(store);
					}else {
						throw new ValidationException(HttpStatus.BAD_REQUEST, "The Request Contains invalid addresscode/dateValidForm", "Invalid Request");
					}
				}
			}else {
				throw new NoDataFoundException(HttpStatus.NOT_FOUND, "No Record Found for the input store Id", "NodataFound");
			}
		}catch(NoDataFoundException ex) {
			throw ex;
		}
		catch(ValidationException ex) {
			throw ex;
		}
		
		return store;
	}
	
	@Override
	public void deleteStore(StoreDetails storeDetails) {
		StoreDetails store = storeRepository.findItemByName(storeDetails.getId());
		
		try {
			if(store!=null) {
				for (StoreVersionPeriod storeVersionPeriod : store.getStoreVersionPeriods()) {
					if(validate(storeVersionPeriod.getAddressCodeEan()) && storeVersionPeriod.getDateValidFrom().after(new Date())) {
						storeRepository.delete(store);
					}else {
						throw new ValidationException(HttpStatus.BAD_REQUEST, "The Request Contains invalid addresscode/dateValidForm", "Invalid Request");
					}
				}
			}else {
				throw new NoDataFoundException(HttpStatus.NOT_FOUND, "No Record Found for the input store Id", "NodataFound");
			}
		}catch(NoDataFoundException ex) {
			throw ex;
		}
		catch(ValidationException ex) {
			throw ex;
		}
		
		
	}
	@Override
	public String storeAvailability(StoreDetails storeDetails) {
		StoreDetails store = storeRepository.findItemByName(storeDetails.getId());
		String availability = null;
		try {
			if(store!=null) {
				for (StoreVersionPeriod storeVersionPeriod : store.getStoreVersionPeriods()) {
					if(validate(storeVersionPeriod.getAddressCodeEan()) && storeVersionPeriod.getDateValidFrom().before(new Date())) {
						availability = "Store Closed / Unavailable";
					}else {
						throw new ValidationException(HttpStatus.BAD_REQUEST, "The Request Contains invalid addresscode/dateValidForm", "Invalid Request");
					}
					availability = "Store is Available. Happy shoppy";
				}
			}else {
				throw new NoDataFoundException(HttpStatus.NOT_FOUND, "No Record Found for the input store Id", "NodataFound");
			}
		}catch(NoDataFoundException ex) {
			throw ex;
		}
		catch(ValidationException ex) {
			throw ex;
		}
		
		return availability;
		
	}
	

}
