package com.microservice.pocket.services;

import com.microservice.pocket.entities.dtos.CreatePocketDto;
import com.microservice.pocket.entities.dtos.ResponsePocketDto;

public interface IPocketService {

	public ResponsePocketDto createPocket(CreatePocketDto pocket) throws Exception;
		
}
