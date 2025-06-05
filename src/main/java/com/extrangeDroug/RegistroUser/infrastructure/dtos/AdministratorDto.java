package com.extrangeDroug.RegistroUser.infrastructure.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AdministratorDto extends UserDto {

    @NotBlank(message = "La experiencia es obligatoria")  
    private String experience;

    @NotBlank(message = "El código es obligatorio")
    private String code;

}
