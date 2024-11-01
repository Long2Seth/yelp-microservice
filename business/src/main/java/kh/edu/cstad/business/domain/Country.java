package kh.edu.cstad.business.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalIdCache;

@Setter
@Getter
@NaturalIdCache
@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true , nullable = false)
    private String name;

    @Column(unique = true , nullable = false)
    private String code;

}
