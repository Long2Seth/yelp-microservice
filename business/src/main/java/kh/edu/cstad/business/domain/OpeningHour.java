package kh.edu.cstad.business.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "opening_hours")
public class OpeningHour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int day;

    @Column(nullable = false)
    private String start;

    @Column(nullable = false)
    private String end;

    @Column(nullable = false)
    private boolean isOverNight;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;
}