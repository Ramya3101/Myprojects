package com.codechallange.storeinformation.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.codechallange.storeinformation.model.StoreDetails;

@Component
public interface StoreService {

	public void createStore(StoreDetails storeDetails) ;

	public List<StoreDetails> getAllStores();

	public StoreDetails getStoresById(Integer id);

	public StoreDetails updateStore(StoreDetails storeDetails);

	public void deleteStore(StoreDetails storeDetails);

	public String storeAvailability(StoreDetails storeDetails);

}
