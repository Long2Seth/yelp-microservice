package kh.edu.cstad.business.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "business")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true , nullable = false)
    private String alias;

    @Column(unique = true , nullable = false)
    private String username;

    private String imageUrl;

    @Column(nullable = false)
    private boolean isClosed;

    private String url;

    private int reviewCount;

    private String rating;

    private String price;

    @Column(unique = true, nullable = false)
    private String phone;

    @Column(unique = true, nullable = false)
    private String displayPhone;

    private String distance; // Distance in meters from the search location. This value is in meters(m) regardless of the locale.

}
