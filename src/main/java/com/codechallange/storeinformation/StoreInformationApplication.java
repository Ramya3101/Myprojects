package com.codechallange.storeinformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.codechallange.storeinformation.model.StoreDetails;
import com.codechallange.storeinformation.repository.StoreRepository;

@SpringBootApplication
@EnableMongoRepositories
public class StoreInformationApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(StoreInformationApplication.class, args);
	}

}

