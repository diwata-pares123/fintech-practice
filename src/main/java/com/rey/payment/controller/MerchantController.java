package com.rey.payment.controller;

import com.rey.payment.domain.Merchant;
import com.rey.payment.dto.MerchantRequest;
import com.rey.payment.service.MerchantServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/merchants")
public class MerchantController {

    private final MerchantServiceImpl service;

    public MerchantController(MerchantServiceImpl service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Merchant> onboardMerchant(@Valid @RequestBody MerchantRequest request) {
        Merchant savedMerchant = service.registerMerchant(request);
        return new ResponseEntity<>(savedMerchant, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Merchant> getMerchant(@PathVariable UUID id) {
        Merchant merchant = service.getMerchantById(id);
        return ResponseEntity.ok(merchant);
    }
}