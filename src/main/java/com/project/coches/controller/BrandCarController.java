package com.project.coches.controller;

import com.project.coches.domain.dto.BrandCarDto;
import com.project.coches.domain.useCase.IBrandCarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador rest de Marca Coche
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/brands-car")
public class BrandCarController {

    /**
     * Servicio de marca coche
     */
    private final IBrandCarUseCase iBrandCarUseCase;


    /**
     * Devuelve lista de marcas coche
     * @return HttpCode Ok con lista de marcas coche
     */
    @GetMapping()
    public ResponseEntity<List<BrandCarDto>> getAll() {
        return ResponseEntity.ok(iBrandCarUseCase.getAll());
        // return ResponseEntity.status(HttpStatus.)
        //        .body(iBrandCarService.getAll()); ALTERNATIVA PARA CREAR RESPONSE_ENTITY

        // return new ResponseEntity<>(iBrandCarService.getAll(), HttpStatus.OK); ALTERNATIVA PARA CREAR RESPONSE_ENTITY
    }


    /**
     * Devuelve una marca coche dado su id
     * @param id Id de la marca coche a buscar
     * @return HttpCode Ok si la encuentra, HttpCode Not found de lo contrario
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandCarDto> getBrandCar(@PathVariable Integer id) {
        return ResponseEntity.of(iBrandCarUseCase.getBrandCar(id));
    }


    /**
     * Crea una nueva marca coche
     * @param brandCarDtoNew Marca coche a crear
     * @return HttpCode Created si la guarda correctamente, HttpCode BadRequest de lo contrario
     */
    @PostMapping()
    public ResponseEntity<BrandCarDto> save(@RequestBody BrandCarDto brandCarDtoNew) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iBrandCarUseCase.save(brandCarDtoNew));
        } catch (Exception e){
            //Corregir porque no está mandando excepcion
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    /**
     * Actualiza una marca coche
     * @param brandCarDtoUpdate Marca coche actualizada
     * @return HttpCode Ok si la actualiza correctamente
     */
    @PatchMapping
    public ResponseEntity<BrandCarDto> update(@RequestBody BrandCarDto brandCarDtoUpdate) {
        return ResponseEntity.of(iBrandCarUseCase.update(brandCarDtoUpdate));
    }


    /**
     * Elimina una marca coche dado su id
     * @param id Id de la marca coche a eliminar
     * @return HttpCode Ok si la elimina, HttpCode Not Found si no existe
     */
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(this.iBrandCarUseCase.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }


}
