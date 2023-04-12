package com.project.coches.domain.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Pojo de marca coche
 */
@Getter @Setter
public class BrandCarDto {

    /**
     * Id de la marca
     */
    private Integer id;

    /**
     * Descripcion de la marca
     */
    private String description;
}
