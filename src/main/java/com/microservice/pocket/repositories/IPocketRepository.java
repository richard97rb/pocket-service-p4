package com.microservice.pocket.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.pocket.entities.Pocket;

public interface IPocketRepository extends MongoRepository<Pocket, ObjectId> {

}
