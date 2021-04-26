package pl.robocikd.springndblog.service;

import org.springframework.stereotype.Service;
import pl.robocikd.springndblog.dto.RegisterRequest;
import pl.robocikd.springndblog.model.User;
import pl.robocikd.springndblog.repository.UserRepository;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());

        userRepository.save(user);
    }
}
