package com.extrangeDroug.RegistroUser.infrastructure.mappers;

import java.util.Map;
import com.extrangeDroug.RegistroUser.domain.models.User;
import com.extrangeDroug.RegistroUser.infrastructure.dtos.AdministratorDto;
import com.extrangeDroug.RegistroUser.infrastructure.dtos.CustomerDto;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserMapper {
    public static User toModel(Map<String, Object> userMap) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            
            if (userMap.containsKey("amount") && userMap.containsKey("phone")) {
                // Es un cliente
                CustomerDto customerDto = CustomerDto.builder()
                    .amount(Double.parseDouble(userMap.get("amount").toString()))
                    .phone(userMap.get("phone").toString())
                    .name(userMap.get("name").toString())
                    .email(userMap.get("email").toString())
                    .password(userMap.get("password").toString())
                    .build();
                return CustomerMapper.toModel(customerDto);
            } 
            else if (userMap.containsKey("experience") && userMap.containsKey("code")) {
                // Es un administrador
                 AdministratorDto adminDto = AdministratorDto.builder()
                    .experience(userMap.get("experience").toString())
                    .code(userMap.get("code").toString())
                    .name(userMap.get("name").toString())
                    .email(userMap.get("email").toString())
                    .password(userMap.get("password").toString())
                    .build();
                return AdministratorMapper.toModel(adminDto);
            }
            else {
                throw new IllegalArgumentException("Tipo de usuario no válido. Debe ser cliente (amount, phone) o administrador (experience, code)");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al procesar el usuario: " + e.getMessage());
        }
    }
}
