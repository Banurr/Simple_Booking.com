package cloud.midterm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pictures")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Picture
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] picture;

    public Picture(byte[] arr)
    {
        this.picture = arr;
    }
}
