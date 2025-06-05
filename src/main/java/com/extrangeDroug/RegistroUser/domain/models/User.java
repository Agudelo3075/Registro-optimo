package com.extrangeDroug.RegistroUser.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class User {
    protected Long id;
    protected String name;
    protected String email;
    protected String password;
    protected String rol;
}