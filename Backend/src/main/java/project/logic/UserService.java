package project.logic;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import project.DTO.user_class.User;
import project.interfaces.IUserRepo;
import project.security.UserCreateRequest;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IUserRepo userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public User readUserByUsername (String username) {
        return userRepository.getUserByUsername(username).orElseThrow(EntityNotFoundException::new);
    }
    public void createUser(UserCreateRequest userCreateRequest) {
        User user = new User();
        Optional<User> byUsername = userRepository.getUserByUsername(userCreateRequest.getUsername());
        if (byUsername.isPresent()) {
            throw new RuntimeException("User already registered. Please use different username.");
        }
        user.setUsername(userCreateRequest.getUsername());
        user.setPassword(passwordEncoder.encode(userCreateRequest.getPassword()));
        user.setRole("USER");
        userRepository.save(user);
    }
}
