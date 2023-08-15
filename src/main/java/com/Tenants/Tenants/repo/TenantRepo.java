package com.Tenants.Tenants.repo;

import com.Tenants.Tenants.model.Tenants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepo extends JpaRepository<Tenants, Long> {


}
