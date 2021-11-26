package project.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import project.DTO.user_class.User;

import java.util.Optional;

public interface IUserRepo extends JpaRepository<User, Long> {
    Optional<User> getUserByUsername(String username);
}
