package com.diploma.demo.core.ownership;

import com.diploma.demo.core.owner.Owner;
import com.diploma.demo.core.stateregistration.StateRegistration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ownership")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Ownership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Доля
    @Column(name = "proportion")
    private Double proportion;

    @Column(name="registration_date")
    private LocalDate registrationDate;

    @OneToOne
    private Owner owner;

    @OneToMany(mappedBy = "ownership")
    private List<StateRegistration> stateRegistrations;
}
