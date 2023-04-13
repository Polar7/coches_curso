package com.project.coches.domain.useCase;

import com.project.coches.domain.dto.BrandCarDto;

import java.util.List;
import java.util.Optional;

public interface IBrandCarUseCase {

    /**
     * Devuelve una lista con todas las marcas de coches
     * @return Lista con marcas de coches
     */
    List<BrandCarDto> getAll();

    /**
     * Devuelve una marca de coche dada su id
     * @param id Id de marca coche
     * @return Optional del marca coche encontrado
     */
    Optional<BrandCarDto> getBrandCar(Integer id);

    /**
     * Guarda una nueva marca coche
     * @param newBrandCar Marca coche a guardar
     * @return Marca coche guardada
     */
    BrandCarDto save(BrandCarDto newBrandCar);


    /**
     * Actualiza una marcha coche
     * @param newBrandCar Marca coche a actualizar
     * @return Marca coche actualizada
     */
    Optional<BrandCarDto> update(BrandCarDto newBrandCar);

    /**
     * Elimina una marca coche dada su id
     * @param idBrandCar Id del marca coche a eliminar
     * @return true si se eliminó, false de lo contrario
     */
    boolean delete(Integer idBrandCar);
}
