package cloud.midterm.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "apartments")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Apartment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer area;

    private String address;

    private Integer price;

    @OneToMany
    private List<Picture> pictures;
}
