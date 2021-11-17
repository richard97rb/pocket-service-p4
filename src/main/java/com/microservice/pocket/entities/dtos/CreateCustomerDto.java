package com.microservice.pocket.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerDto {

    private String name;

    private String lastName;

    private String dni;

    private CustomerType type;
}
