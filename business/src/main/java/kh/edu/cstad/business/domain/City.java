package kh.edu.cstad.business.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true , nullable = false)
    private String name;

    @Column(unique = true , nullable = false)
    private String address;

    @Column(unique = true , nullable = false)
    private String state;

    @Column(unique = true , nullable = false)
    private String city;

    @Column(unique = true , nullable = false)
    private String zipCode;

    @ManyToOne
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<Business> businesses;
}