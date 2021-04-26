package com.diploma.demo.core.building.repository;

import com.diploma.demo.core.building.uninsulated.UninsulatedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UninsulatedRoomRepository extends JpaRepository<UninsulatedRoom, Long> {
}