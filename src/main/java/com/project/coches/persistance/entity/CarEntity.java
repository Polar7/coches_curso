package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Entidad de coches
 */
@Getter @Setter
@Entity
@Table(name = "coches")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_coche")
    private Integer codeCar;


    @Column(name = "marca_coche_id")
    private Integer brandCarId;

    @Column(name = "referencia")
    private String reference;

    @Column(name = "precio")
    private Double price;

    @Column(name = "anio_modelo")
    private Double modelYear;

    private String color;

    @Column(name = "numero_caballos_fuerza")
    private Double horsepower;

    @Column(name = "cantidad_puertas")
    private Integer numberDoor;

    @Column(name = "cilindraje")
    private Double engineDisplacement;

    @Column(name = "transmision")
    private String transmission;

    @Column(name = "tipo_combustible")
    private String fuelType;

    @Column(name = "cantidad_asientos")
    private Integer numberSeats;

    @Column(name = "traccion")
    private Integer traction;

    @Column(name = "direccion")
    private String steering;

    @Column(name = "categoria")
    private String category;

    @Column(name = "ruta_imagen")
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "marca_coche_id", insertable = false, updatable = false)
    private BrandCarEntity brandCarEntity;

    @OneToMany(mappedBy = "carEntity")
    private List<CarPurchaseEntity> carPurchaseEntity;


    @Override
    public String toString() {
        return "CarEntity{" +
                "codeCar=" + codeCar +
                ", brandCarId=" + brandCarId +
                ", reference='" + reference + '\'' +
                ", price=" + price +
                ", modelYear=" + modelYear +
                ", color='" + color + '\'' +
                ", horsepower=" + horsepower +
                ", numberDoor=" + numberDoor +
                ", engineDisplacement=" + engineDisplacement +
                ", transmission='" + transmission + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", numberSeats=" + numberSeats +
                ", traction=" + traction +
                ", steering='" + steering + '\'' +
                ", category='" + category + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", brandCarEntity=" + brandCarEntity.toString() +
                '}';
    }
}
