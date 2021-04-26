package com.diploma.demo.core.building.uninsulated;

import com.diploma.demo.core.building.Building;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "uninsulated_room")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class UninsulatedRoom {

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
