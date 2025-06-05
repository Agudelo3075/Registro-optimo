package com.extrangeDroug.RegistroUser.application.usecases;

import com.extrangeDroug.RegistroUser.domain.models.User;
import com.extrangeDroug.RegistroUser.domain.ports.in.CreateUserUseCase;
import com.extrangeDroug.RegistroUser.domain.ports.out.UserRepositoryPort;
import com.extrangeDroug.RegistroUser.infrastructure.entities.AdministratorEntity;
import com.extrangeDroug.RegistroUser.infrastructure.entities.CustomerEntity;
import com.extrangeDroug.RegistroUser.infrastructure.entities.UserEntity;
import com.extrangeDroug.RegistroUser.infrastructure.mappers.AdministratorMapper;
import com.extrangeDroug.RegistroUser.infrastructure.mappers.CustomerMapper;
import com.extrangeDroug.RegistroUser.domain.models.Customer;
import com.extrangeDroug.RegistroUser.domain.models.Administrator;

public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private final UserRepositoryPort userRepositoryPort;

    public CreateUserUseCaseImpl(UserRepositoryPort userRepositoryPort){
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = null;
        if(user instanceof Customer){
            Customer customer = (Customer) user;
            userEntity = CustomerMapper.toEntity(customer);
        } else if(user instanceof Administrator){
            Administrator administrator = (Administrator) user;
            userEntity = AdministratorMapper.toEntity(administrator);
        }

        UserEntity savedUserEntity = userRepositoryPort.save(userEntity);

        if(savedUserEntity instanceof CustomerEntity){
            return CustomerMapper.toModel((CustomerEntity) savedUserEntity);
        } else if(savedUserEntity instanceof AdministratorEntity){
            return AdministratorMapper.toModel((AdministratorEntity) savedUserEntity);
        }
        return null;
    }

    
}
