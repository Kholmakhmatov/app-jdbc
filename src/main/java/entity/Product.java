package entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {
    private  Integer id;
    private String name;
    private Boolean active;
    private Integer Category_id;
    private  Integer Measurement_id;
    private Integer Attachment_id;
}
