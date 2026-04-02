package times.TimeSheet.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import times.TimeSheet.dto.UserDto;
import times.TimeSheet.model.User;
import times.TimeSheet.service.UserService;
import times.TimeSheet.transformer.UserTransformer;

@Component
@RequiredArgsConstructor
public class UserHandler {

    private final UserTransformer userTransformer;
    private final UserService userService;

    public UserDto registerUser(UserDto userDto){
        User user = userTransformer.toEntity(userDto);
        User savedUser = userService.registerUser(user);
        return userTransformer.toDto(savedUser);
    }
}
