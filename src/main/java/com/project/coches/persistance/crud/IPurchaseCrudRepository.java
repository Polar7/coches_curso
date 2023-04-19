package com.project.coches.persistance.crud;

import com.project.coches.persistance.entity.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IPurchaseCrudRepository extends JpaRepository<PurchaseEntity, Integer> {

}
