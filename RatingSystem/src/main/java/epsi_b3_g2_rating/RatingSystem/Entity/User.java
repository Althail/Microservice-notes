package epsi_b3_g2_rating.RatingSystem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "email")
    private String email;

    @Column(name = "birthdate")
    private String birthDate;

    @Column(name = "password")
    private String passWord;
}
