package project.repositoryInterfaces;

import project.Models.user_class.User;

import java.util.Optional;

public interface IUserRepository {
    Optional<User> getUserByUsername(String username);
    void CreateUser(User u);

}
