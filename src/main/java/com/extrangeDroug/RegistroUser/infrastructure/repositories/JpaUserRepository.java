package com.extrangeDroug.RegistroUser.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.extrangeDroug.RegistroUser.infrastructure.entities.UserEntity;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, Long>{

}
