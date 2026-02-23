package com.rey.payment.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class MerchantRequest {
    
    @NotBlank(message = "Business name cannot be blank")
    private String businessName;

    @Pattern(regexp = "^(LLC|CORPORATION|SOLE_PROPRIETORSHIP)$", 
             message = "Type must be exactly LLC, CORPORATION, or SOLE_PROPRIETORSHIP")
    private String entityType;

    public String getBusinessName() { return businessName; }
    public void setBusinessName(String businessName) { this.businessName = businessName; }

    public String getEntityType() { return entityType; }
    public void setEntityType(String entityType) { this.entityType = entityType; }
}