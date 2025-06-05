package com.extrangeDroug.RegistroUser.domain.ports.out;

import com.extrangeDroug.RegistroUser.infrastructure.entities.UserEntity;

public interface UserRepositoryPort {

    UserEntity save(UserEntity userEntity);
    
}
