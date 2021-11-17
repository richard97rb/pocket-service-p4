package com.microservice.pocket.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "pockets")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pocket {

	@Id
    private ObjectId _id;
	
    private String description;
    
    private String customerId;

}
