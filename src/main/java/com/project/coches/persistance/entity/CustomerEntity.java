package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Entidad de un cliente
 */
@Getter @Setter
@Entity
@Table(name = "clientes")
public class CustomerEntity {

    @Id
    @Column(name = "cedula")
    private String cardId;

    @Column(name = "nombre_completo")
    private String fullName;

    @Column(name = "correo")
    private String email;

    @Column(name = "numero_celular")
    private Double numberCellphone;

    @Column(name = "activo")
    private Integer active;

    @Column(name = "contrasenia")
    private String password;

    private String rol;

    @OneToMany(mappedBy = "customerEntity")
    private List<PurchaseEntity> purchaseEntity;
}
