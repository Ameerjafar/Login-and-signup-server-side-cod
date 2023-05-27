package com.example.demomongodbconnection.repositary;

import com.example.demomongodbconnection.model.Authentication;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface Repository extends MongoRepository<Authentication, Integer> {

}
