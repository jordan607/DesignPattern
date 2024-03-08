package Example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    private long id;
    private String userName;
    private String password;
    private String email;
}
