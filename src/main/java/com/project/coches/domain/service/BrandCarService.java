package com.project.coches.domain.service;

import com.project.coches.domain.dto.BrandCarDto;
import com.project.coches.domain.repository.IBrandCarRepository;
import com.project.coches.domain.useCase.IBrandCarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio de marca coche
 */
@RequiredArgsConstructor
@Service
public class BrandCarService implements IBrandCarUseCase {

    /**
     * Repositorio de marca coche
     */
    private final IBrandCarRepository iBrandCarRepository;

    /**
     * Devuelve una lista con todas las marcas de coches
     * @return Lista con marcas de coches
     */
    @Override
    public List<BrandCarDto> getAll() {
        return iBrandCarRepository.getAll();
    }

    /**
     * Devuelve una marca de coche dada su id
     * @param id Id de marca coche
     * @return Optional del marca coche encontrado
     */
    @Override
    public Optional<BrandCarDto> getBrandCar(Integer id) {
        return iBrandCarRepository.getBrandCar(id);
    }

    /**
     * Guarda una nueva marca coche
     * @param newBrandCar Marca coche a guardar
     * @return Marca coche guardada
     */
    @Override
    public BrandCarDto save(BrandCarDto newBrandCar) {
        return iBrandCarRepository.save(newBrandCar);
    }

    /**
     * Actualiza una marca coche
     * @param newBrandCar Marca coche a actualizar
     * @return Optional con marca coche actualizada
     */
    @Override
    public Optional<BrandCarDto> update(BrandCarDto newBrandCar) {

        if (iBrandCarRepository.getBrandCar(newBrandCar.getId()).isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(iBrandCarRepository.save(newBrandCar));
    }

    /**
     * Elimina una marca coche dada su id
     * @param idBrandCar Id del marca coche a eliminar
     * @return true si se eliminó, false de lo contrario
     */
    @Override
    public boolean delete(Integer idBrandCar) {

        if (iBrandCarRepository.getBrandCar(idBrandCar).isEmpty()) {
            return false;
        }

        iBrandCarRepository.delete(idBrandCar);
        return true;
    }
}
