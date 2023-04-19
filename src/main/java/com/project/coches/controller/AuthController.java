package com.project.coches.controller;


import com.project.coches.domain.dto.AuthCustomerDto;
import com.project.coches.domain.dto.JwtResponseDto;
import com.project.coches.domain.useCase.IAuthUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/auth")
public class AuthController {

    private final IAuthUseCase iAuthUseCase;


    @GetMapping()
    public ResponseEntity<JwtResponseDto> prueba() {
        return ResponseEntity.ok(new JwtResponseDto("prueba"));
    }

    @PostMapping(path = "/sign-in")
    public ResponseEntity<JwtResponseDto> signIn(@RequestBody AuthCustomerDto authCustomerDto) {
        return ResponseEntity.ok(iAuthUseCase.signIn(authCustomerDto));
    }

    @PostMapping(path = "/sign-out")
    public ResponseEntity<JwtResponseDto> signOut(@RequestHeader(name = HttpHeaders.AUTHORIZATION) String jwt) {
        return ResponseEntity.ok(iAuthUseCase.signOut(jwt));
    }
}
