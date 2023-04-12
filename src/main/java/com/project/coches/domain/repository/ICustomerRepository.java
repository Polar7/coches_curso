package com.project.coches.domain.repository;

import com.project.coches.domain.dto.BrandCarDto;
import com.project.coches.domain.dto.CustomerDto;

import java.util.List;
import java.util.Optional;

/**
 * Interface del repositorio de Cliente
 */
public interface ICustomerRepository {

    /**
     * Devuelve una lista con todos los cliente
     * @return Lista con clientes
     */
    List<CustomerDto> getAll();


    Optional<CustomerDto> getCustomerByCardId(String cardId);


    Optional<CustomerDto> getCustomerByEmail(String email);


    CustomerDto save(CustomerDto newCustomer);


    void delete(String  cardId);
}
