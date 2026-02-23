package com.rey.payment.domain;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "merchants")
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    private String businessName;
    private String entityType;
    private boolean isVerified;

    public Merchant() {}

    public Merchant(String businessName, String entityType, boolean isVerified) {
        this.businessName = businessName;
        this.entityType = entityType;
        this.isVerified = isVerified;
    }

    public UUID getId() { return id; }
    public String getBusinessName() { return businessName; }
    public String getEntityType() { return entityType; }
    public boolean isVerified() { return isVerified; }
}