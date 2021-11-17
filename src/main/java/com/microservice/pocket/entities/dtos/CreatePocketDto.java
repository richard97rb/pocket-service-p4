package com.microservice.pocket.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePocketDto {
	
	private String description;
	
	private CreateCustomerDto customer;
	
}
