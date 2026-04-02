package times.TimeSheet.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "frontend_users")
public class User {
    @Id
    private UUID id;
    private String FullName;
    private String email;
    private String password;
    private String company;
    private String role;
}
