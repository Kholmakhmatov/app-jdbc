package entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Client {
    private Integer id;
    private String  name;
    private  Boolean active;
    private String phoneNumber;

}
