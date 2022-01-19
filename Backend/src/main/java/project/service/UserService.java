package project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import project.Models.user_class.User;
import project.DBAccessInterfaces.IUserRepo;
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
    public boolean createUser(UserCreateRequest userCreateRequest) {
        User user = new User();
        Optional<User> byUsername = userRepository.getUserByUsername(userCreateRequest.getUsername());
        if (byUsername.isPresent()) {
            return false;
        }
        user.setUsername(userCreateRequest.getUsername());
        user.setPassword(passwordEncoder.encode(userCreateRequest.getPassword()));
        user.setRole(userCreateRequest.getRole());
        userRepository.save(user);
        return true;
    }
}
