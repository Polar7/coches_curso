package com.project.coches.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Dto de la consulta de los carros de una compra
 */
@Getter @Setter
@AllArgsConstructor
public class CarPurchaseResponseDto {

    private String referenceCar;

    private Integer quantity;

    private Integer total;

}
