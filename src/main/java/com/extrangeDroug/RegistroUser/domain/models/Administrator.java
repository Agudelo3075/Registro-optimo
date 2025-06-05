package com.extrangeDroug.RegistroUser.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class Administrator extends User {
    private String experience;
    private String code;

}