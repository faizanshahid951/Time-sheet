package times.TimeSheet.transformer;

import org.springframework.stereotype.Component;
import times.TimeSheet.dto.UserDto;
import times.TimeSheet.model.User;

import java.util.UUID;

@Component

public class UserTransformer {
    public User toEntity(UserDto userDto) {
        return User.builder()
                .id(UUID.randomUUID())
                .email(userDto.getEmail())
                .FullName(userDto.getFullName())
                .password(userDto.getPassword())
                .company(userDto.getCompany())
                .role(userDto.getRole())
                .build();
    }

    public UserDto toDto(User user) {
        return UserDto.builder()
                .email(user.getEmail())
                .FullName(user.getFullName())
                .password(user.getPassword())
                .company(user.getCompany())
                .role(user.getRole())
                .build();
    }
}
