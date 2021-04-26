package com.diploma.demo.core.restriction.repository;

import com.diploma.demo.core.restriction.Restriction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestrictionRepository extends JpaRepository<Restriction, Long> {
}