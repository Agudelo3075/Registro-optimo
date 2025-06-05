package com.extrangeDroug.RegistroUser.infrastructure.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class UserDto {

    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    protected String name;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El email no es válido")
    protected String email;

    @NotBlank(message = "La contraseña es obligatoria")
    protected String password;

    protected String role;

}
