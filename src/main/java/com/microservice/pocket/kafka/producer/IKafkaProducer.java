package com.microservice.pocket.kafka.producer;

import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

import com.microservice.pocket.entities.dtos.CreateCustomerDto;

public interface IKafkaProducer {
	
	ListenableFuture<SendResult<String, Object>> sendJson(String topic, Object customer);
	
}
