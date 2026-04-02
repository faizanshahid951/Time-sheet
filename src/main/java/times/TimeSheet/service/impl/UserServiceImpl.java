package times.TimeSheet.service.impl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import times.TimeSheet.model.User;
import times.TimeSheet.repository.UserRepository;
import times.TimeSheet.service.UserService;
@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
