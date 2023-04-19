package com.project.coches.persistance.repository;

import com.project.coches.domain.dto.PurchaseRequestDto;
import com.project.coches.domain.dto.PurchaseResponseDto;
import com.project.coches.domain.repository.IPurchaseRepository;
import com.project.coches.persistance.crud.IPurchaseCrudRepository;
import com.project.coches.persistance.entity.PurchaseEntity;
import com.project.coches.persistance.mapper.IPurchaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class PurchaseRepository implements IPurchaseRepository {

    private final IPurchaseCrudRepository iPurchaseCrudRepository;

    private final IPurchaseMapper iPurchaseMapper;

    @Override
    public List<PurchaseResponseDto> getAll() {

       // List<PurchaseEntity> listPurchasesEntity = iPurchaseCrudRepository.findAll();

       // for (PurchaseEntity purchaseEntity: listPurchasesEntity) {
        //    List<>purchaseEntity.getCarsPurchase();
        //}
       return null;
    }

    @Override
    public List<PurchaseResponseDto> getByIdCustomer(String idCustomer) {
        return null;
    }

    @Override
    public PurchaseResponseDto save(PurchaseRequestDto purchaseRequestDto) {
        return null;
    }
}
