package com.extrangeDroug.RegistroUser.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.extrangeDroug.RegistroUser.application.services.UserService;
import com.extrangeDroug.RegistroUser.application.usecases.CreateUserUseCaseImpl;
import com.extrangeDroug.RegistroUser.domain.ports.out.UserRepositoryPort;
import com.extrangeDroug.RegistroUser.infrastructure.repositories.JpaUserRepositoryAdapter;

@Configuration
public class ApplicationConfig {

    @Bean
    public UserService userService(UserRepositoryPort userRepositoryPort){
        return new UserService(
            new CreateUserUseCaseImpl(userRepositoryPort)
        );
    }

    @Bean 
    public UserRepositoryPort userRepositoryPort(JpaUserRepositoryAdapter jpaUserRepositoryAdapter){
        return jpaUserRepositoryAdapter;
    }

}
