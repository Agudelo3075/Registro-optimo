package com.extrangeDroug.RegistroUser.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class Customer extends User {
    private Double amount;
    private String phone;

}