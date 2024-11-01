package kh.edu.cstad.review.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "review")
public class Review {

    @Id
    @Column(unique = true, nullable = false)
    private String id;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private String rating;

    @Column(nullable = false)
    private String time_created;

    @OneToOne
    private User user;
}
