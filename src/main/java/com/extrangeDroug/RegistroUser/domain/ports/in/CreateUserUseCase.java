package com.extrangeDroug.RegistroUser.domain.ports.in;

import com.extrangeDroug.RegistroUser.domain.models.User;

public interface CreateUserUseCase {

    User createUser(User user);
    
}
