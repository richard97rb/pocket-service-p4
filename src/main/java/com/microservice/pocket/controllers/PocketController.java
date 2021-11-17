package com.microservice.pocket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.pocket.entities.dtos.CreatePocketDto;
import com.microservice.pocket.entities.dtos.ResponsePocketDto;
import com.microservice.pocket.services.IPocketService;

import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
        RequestMethod.DELETE })
@RequestMapping("/api/pockets")
public class PocketController {
	
	@Autowired
	private IPocketService pocketService;
	
	@PostMapping("/")
	public Mono<ResponsePocketDto> createPocket(@RequestBody CreatePocketDto createPocket) throws Exception {
		return Mono.just(pocketService.createPocket(createPocket));
	}
	
}
