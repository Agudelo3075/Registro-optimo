package com.extrangeDroug.RegistroUser.infrastructure.repositories;

import org.springframework.stereotype.Component;
import com.extrangeDroug.RegistroUser.domain.ports.out.UserRepositoryPort;
import com.extrangeDroug.RegistroUser.infrastructure.entities.UserEntity;

@Component
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final JpaUserRepository jpaUserRepository;

    public JpaUserRepositoryAdapter(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        UserEntity savedUserEntity = jpaUserRepository.save(userEntity);
        return savedUserEntity;
    }
}