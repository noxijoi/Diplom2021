package com.diploma.demo.core.organization.repository;

import com.diploma.demo.core.organization.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}