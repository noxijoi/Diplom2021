package com.diploma.demo.core.building.izolated;

import com.diploma.demo.core.building.Building;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "isolated_room")
@Audited
public class IsolatedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="inventory_number")
    private String inventoryNumber;

    @Column(name = "surface")
    private Double surface;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="building_id")
    private Building building;
}