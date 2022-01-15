package entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Measurement {
    private Integer id;
    private  String name;
    private  Boolean active;
}
