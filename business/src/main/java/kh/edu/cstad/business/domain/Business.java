package kh.edu.cstad.business.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @ManyToMany
    @JoinTable(
            name = "business_category",
            joinColumns = @JoinColumn(name = "business_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;

    @OneToMany(mappedBy = "business")
    private List<Review> reviews;

    @OneToMany(mappedBy = "business")
    private List<OpeningHour> openingHours;
}