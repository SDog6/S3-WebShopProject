package project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.DBAccessInterfaces.IUserRepo;
import project.Models.user_class.User;
import project.repositoryInterfaces.IUserRepository;

import java.util.Optional;

@Repository
public class UserRepo implements IUserRepository {

    @Autowired
    IUserRepo repo;

    @Override
    public Optional<User> getUserByUsername(String username) {
        return repo.getUserByUsername(username);
    }

    @Override
    public void CreateUser(User u) {
        repo.save(u);
    }
}
