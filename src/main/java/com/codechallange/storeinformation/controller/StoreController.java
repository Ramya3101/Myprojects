package com.codechallange.storeinformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codechallange.storeinformation.model.StoreDetails;
import com.codechallange.storeinformation.service.StoreService;


@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoreService storeService;
	
	@PostMapping(value = "/createStore")
	public ResponseEntity<StoreDetails> createStore(@RequestBody StoreDetails storeDetails) {
		storeService.createStore(storeDetails);
	    return new ResponseEntity("Store added successfully", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAllStores")
	public ResponseEntity<List<StoreDetails>> getAllStore() {
		List<StoreDetails> storeDetails = storeService.getAllStores();
	    return new ResponseEntity(storeDetails, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getStoresById")
	public ResponseEntity<StoreDetails> getStoresById(@PathVariable Integer id) {
		StoreDetails storeDetails = storeService.getStoresById(id);
	    return new ResponseEntity(storeDetails, HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateStore")
	public ResponseEntity<StoreDetails> updateStore(@RequestBody StoreDetails storeDetails) {
		StoreDetails updatedStore = storeService.updateStore(storeDetails);
	    return new ResponseEntity(updatedStore, HttpStatus.ACCEPTED);
	}
	
	@PutMapping(value = "/deleteStore")
	public ResponseEntity<String> deleteStore(@RequestBody StoreDetails storeDetails) {
		storeService.deleteStore(storeDetails);
	    return new ResponseEntity("Deleted Successfully", HttpStatus.OK);
	}
	
	@PutMapping(value = "/storeAvailability")
	public ResponseEntity<String> storeAvailability(@RequestBody StoreDetails storeDetails) {
		String availability = storeService.storeAvailability(storeDetails);
	    return new ResponseEntity(availability, HttpStatus.OK);
	}
}
