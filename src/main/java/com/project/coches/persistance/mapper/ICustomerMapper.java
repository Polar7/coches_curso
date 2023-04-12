package com.project.coches.persistance.mapper;

import com.project.coches.domain.dto.CustomerDto;
import com.project.coches.persistance.entity.CustomerEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper de cliente
 */
@Mapper(componentModel = "spring")
public interface ICustomerMapper {

    CustomerDto toCustomerDto(CustomerEntity customerEntity);


    CustomerEntity toCustomerEntity(CustomerDto customerDto);


    List<CustomerDto> toCustomersDto(List<CustomerEntity> customerEntityList);
}
