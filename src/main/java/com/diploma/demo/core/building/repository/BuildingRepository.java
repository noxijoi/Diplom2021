package com.diploma.demo.core.building.repository;

import com.diploma.demo.core.building.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}