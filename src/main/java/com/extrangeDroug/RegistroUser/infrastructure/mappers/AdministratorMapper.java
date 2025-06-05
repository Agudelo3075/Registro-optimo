package com.extrangeDroug.RegistroUser.infrastructure.mappers;

import com.extrangeDroug.RegistroUser.domain.models.Administrator;
import com.extrangeDroug.RegistroUser.infrastructure.dtos.AdministratorDto;
import com.extrangeDroug.RegistroUser.infrastructure.entities.AdministratorEntity;


public class AdministratorMapper {

    public static Administrator toModel(AdministratorDto administratorDto){
        return Administrator.builder()
            .experience(administratorDto.getExperience())
            .code(administratorDto.getCode())
            .id(administratorDto.getId())
            .name(administratorDto.getName())
            .email(administratorDto.getEmail())
            .password(administratorDto.getPassword())
            .build();
    }

    public static AdministratorDto toDto(Administrator administrator){
        return AdministratorDto.builder()
            .experience(administrator.getExperience())
            .code(administrator.getCode())
            .id(administrator.getId())
            .name(administrator.getName())
            .email(administrator.getEmail())
            .password(administrator.getPassword())
            .build();
    }

    public static Administrator toModel(AdministratorEntity administratorEntity){
        return Administrator.builder()
            .experience(administratorEntity.getExperience())
            .code(administratorEntity.getCode())
            .id(administratorEntity.getId())
            .name(administratorEntity.getName())
            .email(administratorEntity.getEmail())
            .password(administratorEntity.getPassword())
            .build();
    }

    public static AdministratorEntity toEntity(Administrator administrator){
        return AdministratorEntity.builder()
            .experience(administrator.getExperience())
            .code(administrator.getCode())
            .id(administrator.getId())
            .name(administrator.getName())
            .email(administrator.getEmail())
            .password(administrator.getPassword())
            .build();
    }
}