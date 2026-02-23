package com.rey.payment.service;

import com.rey.payment.domain.Merchant;
import com.rey.payment.dto.MerchantRequest;
import com.rey.payment.exception.MerchantNotFoundException;
import com.rey.payment.repository.MerchantRepository;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class MerchantServiceImpl {
    private final MerchantRepository repository;

    public MerchantServiceImpl(MerchantRepository repository) {
        this.repository = repository;
    }

    public Merchant registerMerchant(MerchantRequest request) {
        Merchant merchant = new Merchant(
            request.getBusinessName(), 
            request.getEntityType(), 
            false
        );
        return repository.save(merchant);
    }

    public Merchant getMerchantById(UUID id) {
        return repository.findById(id)
            .orElseThrow(() -> new MerchantNotFoundException("Merchant not found with ID: " + id));
    }
}