package project.DBAccessInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import project.Models.user_class.User;

import java.util.Optional;

public interface IUserRepo extends JpaRepository<User, Long> {
    Optional<User> getUserByUsername(String username);
}
