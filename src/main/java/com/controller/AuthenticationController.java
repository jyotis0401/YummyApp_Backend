package com.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import com.dto.CustomerRequest;
import com.dto.LoginRequest;
import com.service.CustomerService;
import com.springframework.http.ResponseEntity;
import com.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    private final CustomerService customerService;

    @PostMapping("/login")
    public ResponseEntity<String> loginCustomer(@RequestBody @Valid LoginRequest request) {
        return ResponseEntity.ok(customerService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerRequest.CreateRequest request) {
        return ResponseEntity.ok(customerService.createCustomer(request));
    }
}

