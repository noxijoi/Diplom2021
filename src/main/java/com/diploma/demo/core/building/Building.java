package com.diploma.demo.core.building;


import com.diploma.demo.core.building.izolated.IsolatedRoom;
import com.diploma.demo.core.building.uninsulated.UninsulatedRoom;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="building")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Audited
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="individual_number")
    private String inventoryNumber;

    @Column(name="floor_n")
    private Integer floorN;

    @Column(name = "underground_floor_n")
    private Integer undergroundFloorN;

    @OneToMany(mappedBy = "building")
    private List<UninsulatedRoom> uninsulatedRooms;

    @OneToMany(mappedBy = "building")
    private List<IsolatedRoom> isolatedRooms;

}
