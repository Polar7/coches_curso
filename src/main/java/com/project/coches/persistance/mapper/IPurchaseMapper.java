package com.project.coches.persistance.mapper;

import com.project.coches.domain.dto.PurchaseRequestDto;
import com.project.coches.persistance.entity.PurchaseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper de compras
 */
@Mapper(componentModel = "spring", uses = {ICarPurchaseMapper.class})
public interface IPurchaseMapper {

    @Mapping(target = "customerEntity", ignore = true)
    PurchaseEntity toPurchaseEntity(PurchaseRequestDto purchaseRequestDto);

}
