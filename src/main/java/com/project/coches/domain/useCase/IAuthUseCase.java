package com.project.coches.domain.useCase;

import com.project.coches.domain.dto.AuthCustomerDto;
import com.project.coches.domain.dto.JwtResponseDto;

public interface IAuthUseCase {

    JwtResponseDto signIn(AuthCustomerDto authCustomerDto);

    JwtResponseDto signOut(String jwt);
}
