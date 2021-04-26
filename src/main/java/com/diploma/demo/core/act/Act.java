package com.diploma.demo.core.act;

import com.diploma.demo.core.restriction.Restriction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Act {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name="name")
    private String name;

    @Column(name="number")
    private String number;

    @Column(name="organization")
    private String organization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="restriction_id")
    private Restriction restriction;

}
