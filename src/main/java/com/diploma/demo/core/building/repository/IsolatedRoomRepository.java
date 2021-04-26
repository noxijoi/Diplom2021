package com.diploma.demo.core.building.repository;

import com.diploma.demo.core.building.izolated.IsolatedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IsolatedRoomRepository extends JpaRepository<IsolatedRoom, Long> {
}
