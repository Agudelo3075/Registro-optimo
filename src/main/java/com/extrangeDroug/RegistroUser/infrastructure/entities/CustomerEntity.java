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
@Table(name = "customers")
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id") // Importante: especificar la clave foránea
public class CustomerEntity extends UserEntity {

    @Column(name = "amount")
    private Double amount;

    @Column(name = "phone")
    private String phone;
}