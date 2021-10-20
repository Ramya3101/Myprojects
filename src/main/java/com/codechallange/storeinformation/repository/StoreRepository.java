package com.codechallange.storeinformation.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.codechallange.storeinformation.model.StoreDetails;

public interface StoreRepository extends MongoRepository<StoreDetails, String> {
    
    @Query("{id:'?0'}")
    StoreDetails findItemByName(Integer id);
    
    @Query("{'title':{'$regex':'?0','$options':'i'}}")  
    StoreDetails findStoreDetails(String pattern);
    
   
    
    public long count();
}
