package com.Tenants.Tenants.service;

import com.Tenants.Tenants.repo.TenantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tenantService {
    private final TenantRepo tenantRepo;
    @Autowired
    public tenantService(TenantRepo tenantRepo) {
        this.tenantRepo = tenantRepo;
    }

}
