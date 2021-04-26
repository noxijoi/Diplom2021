package com.diploma.demo.core.ownership.repository;

import com.diploma.demo.core.ownership.Ownership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnershipRepository extends JpaRepository<Ownership, Long> {
}
