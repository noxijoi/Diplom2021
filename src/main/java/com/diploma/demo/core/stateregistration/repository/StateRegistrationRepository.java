package com.diploma.demo.core.stateregistration.repository;

import com.diploma.demo.core.stateregistration.StateRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRegistrationRepository extends JpaRepository<StateRegistration, Long> {
}