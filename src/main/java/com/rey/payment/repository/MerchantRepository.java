package com.rey.payment.repository;

import com.rey.payment.domain.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface MerchantRepository extends JpaRepository<Merchant, UUID> {
}