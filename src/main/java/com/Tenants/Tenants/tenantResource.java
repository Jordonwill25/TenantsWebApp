package com.Tenants.Tenants;

import com.Tenants.Tenants.service.tenantService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tenantResource {

    private final tenantService tenantservice;

    public tenantResource(tenantService tenantservice) {
        this.tenantservice = tenantservice;
    }
}
