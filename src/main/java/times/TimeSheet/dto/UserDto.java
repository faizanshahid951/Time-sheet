package times.TimeSheet.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String FullName;
    private String email;
    private String password;
    private String company;
    private String role;

}
