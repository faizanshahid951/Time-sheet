package times.TimeSheet.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import times.TimeSheet.dto.UserDto;
import times.TimeSheet.handler.UserHandler;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {

    private final UserHandler userHandler;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDto signupUserDto) {
        try {
            UserDto newUser = userHandler.registerUser(signupUserDto);
            return ResponseEntity.status(201).body(newUser);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());

        }
    }
}
