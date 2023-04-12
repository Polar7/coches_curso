package com.project.coches.persistance.repository;

import com.project.coches.persistance.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICustomerCrudRepository extends JpaRepository<CustomerEntity, String> {

    //Query method
    //@Query("SELECT c FROM CustomerEntity c WHERE c.carId = ?1")
    Optional<CustomerEntity> findByEmail(String email);
}
