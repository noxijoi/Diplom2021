package com.diploma.demo.core.act;

import com.diploma.demo.core.landplot.LandPlot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name="name")
    private String name;

    @Column(name="agreement_participant_1")
    private String agreementParticipant1;

    @Column(name="agreement_participant_2")
    private String agreementParticipant2;

    @Column(name="date_time")
    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="land_plot_id")
    private LandPlot landPlot;
}
