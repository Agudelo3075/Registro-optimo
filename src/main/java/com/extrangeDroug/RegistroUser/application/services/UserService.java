package com.extrangeDroug.RegistroUser.application.services;

import org.springframework.stereotype.Service;

import com.extrangeDroug.RegistroUser.domain.models.User;
import com.extrangeDroug.RegistroUser.domain.ports.in.CreateUserUseCase;

@Service
public class UserService implements CreateUserUseCase {

    private CreateUserUseCase createUserUseCase;

    public UserService(CreateUserUseCase createUserUseCase){
        this.createUserUseCase = createUserUseCase;
    }

    @Override
    public User createUser(User user) {
        return createUserUseCase.createUser(user);
    }    
}