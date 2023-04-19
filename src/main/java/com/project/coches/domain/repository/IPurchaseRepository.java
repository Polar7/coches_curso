package com.project.coches.domain.repository;

import com.project.coches.domain.dto.PurchaseRequestDto;
import com.project.coches.domain.dto.PurchaseResponseDto;

import java.util.List;

public interface IPurchaseRepository {

    List<PurchaseResponseDto> getAll();

    List<PurchaseResponseDto> getByIdCustomer(String idCustomer);

    PurchaseResponseDto save(PurchaseRequestDto purchaseRequestDto);
}
