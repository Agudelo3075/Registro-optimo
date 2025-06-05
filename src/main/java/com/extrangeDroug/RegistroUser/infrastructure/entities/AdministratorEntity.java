package com.extrangeDroug.RegistroUser.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "administrators")
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id") // Importante: especificar la clave foránea
public class AdministratorEntity extends UserEntity {

    @Column(name = "experience", nullable = false)
    private String experience;

    @Column(name = "code", nullable = false)
    private String code;
}