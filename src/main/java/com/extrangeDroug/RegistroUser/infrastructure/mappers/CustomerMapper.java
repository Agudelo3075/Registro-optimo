package com.extrangeDroug.RegistroUser.infrastructure.mappers;

import com.extrangeDroug.RegistroUser.domain.models.Customer;
import com.extrangeDroug.RegistroUser.infrastructure.dtos.CustomerDto;
import com.extrangeDroug.RegistroUser.infrastructure.entities.CustomerEntity;

public class CustomerMapper {

    public static Customer toModel(CustomerDto customerDto){
        return Customer.builder()
            .amount(customerDto.getAmount())
            .phone(customerDto.getPhone())
            .id(customerDto.getId())
            .name(customerDto.getName())
            .email(customerDto.getEmail())
            .password(customerDto.getPassword())
            .build();
    }

    public static CustomerDto toDto(Customer customer){
        return CustomerDto.builder()
            .amount(customer.getAmount())
            .phone(customer.getPhone())
            .id(customer.getId())
            .name(customer.getName())
            .email(customer.getEmail())
            .password(customer.getPassword())
            .build();
    }

    public static Customer toModel(CustomerEntity customerEntity){
        return Customer.builder()
            .amount(customerEntity.getAmount())
            .phone(customerEntity.getPhone())
            .id(customerEntity.getId())
            .name(customerEntity.getName())
            .email(customerEntity.getEmail())
            .password(customerEntity.getPassword())
            .build();
    }

    public static CustomerEntity toEntity(Customer customer){
        return CustomerEntity.builder()
            .amount(customer.getAmount())
            .phone(customer.getPhone())
            .id(customer.getId())
            .name(customer.getName())
            .email(customer.getEmail())
            .password(customer.getPassword())
            .build();
    }
}
