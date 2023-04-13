package com.project.coches.domain.service;

import com.project.coches.domain.dto.CarDto;
import com.project.coches.domain.repository.ICarRepository;
import com.project.coches.domain.useCase.ICarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CarService implements ICarUseCase {

    private final ICarRepository iCarRepository;

    @Override
    public List<CarDto> getAll() {
        return iCarRepository.getAll();
    }

    @Override
    public List<CarDto> getByIdBrandCar(Integer idBrandCar) {
        return iCarRepository.getByIdBrandCar(idBrandCar);
    }

    @Override
    public List<CarDto> getCarsByPriceLessThan(Double price) {
        return iCarRepository.getCarsByPriceLessThan(price);
    }

    @Override
    public Optional<CarDto> getCar(Integer idCar) {
        return iCarRepository.getCar(idCar);
    }

    @Override
    public CarDto save(CarDto newCar) {
        return iCarRepository.save(newCar);
    }

    @Override
    public boolean delete(Integer idCar) {

        if (iCarRepository.getCar(idCar).isEmpty()) {
            return false;
        }

        iCarRepository.delete(idCar);
        return true;
    }
}
