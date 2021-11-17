package com.microservice.pocket.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.pocket.entities.Pocket;
import com.microservice.pocket.entities.dtos.CreatePocketDto;
import com.microservice.pocket.entities.dtos.ResponsePocketDto;
import com.microservice.pocket.kafka.producer.IKafkaProducer;
import com.microservice.pocket.kafka.utils.PocketUtils;
import com.microservice.pocket.repositories.IPocketRepository;
import com.microservice.pocket.services.IPocketService;

@Service
public class PocketServiceImpl implements IPocketService {

	@Autowired
	private IPocketRepository pocketRepository;
	
	@Autowired
	private IKafkaProducer kafkaProducer;

	public static final ModelMapper modelMapper=new ModelMapper();
	
	@Override
	public ResponsePocketDto createPocket(CreatePocketDto pocket) throws Exception {
		
		kafkaProducer.sendJson(PocketUtils.PRODUCER_TOPIC, pocket.getCustomer());
		
		Pocket createPocket = Pocket.builder()
							.description(pocket.getDescription())
							.build();
		
		createPocket = pocketRepository.save(createPocket);
		
		ResponsePocketDto response = modelMapper.map(createPocket, ResponsePocketDto.class);
		
		return response;
	}
	
}
