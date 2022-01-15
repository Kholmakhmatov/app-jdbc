package entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private  Integer id;
    private String email;
    private String password;
    private  String fullName;
    private  String phone;
    private Boolean active;
}
