package com.diploma.demo.core.organization;


import com.diploma.demo.core.landplot.Address;
import com.diploma.demo.core.rightofuse.RightOfUse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="organization")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited(targetAuditMode =  RelationTargetAuditMode.NOT_AUDITED)
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="type")
    private String type;

    @Column(name="name")
    private String name;

    //УНП
    @Column(name="unp")
    private String unp;

    @Column(name="registration_date")
    private LocalDate registrationDate;

    @Embedded
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "right_of_use_id")
    private RightOfUse rightOfUse;

}
