package ma.znagui.majestic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.znagui.majestic.enums.Role;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Document("User")
public class User {
    @Id
    private String id;
    private String fullName;
    private String userName;
    private String password;
    private List<Role> roles;

}
