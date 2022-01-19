package project.fakedatabase;

import project.Models.user_class.User;
import project.repositoryInterfaces.IUserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FakeUserData implements IUserRepository {

    private List<User> UserList;
    public FakeUserData() {
        UserList =  new ArrayList<>();
    }


    @Override
    public Optional<User> getUserByUsername(String username) {
        for (User u: UserList) {
            if (u.getUsername().equals(username)){
                return Optional.of(u);
            }
        }
        return null;
    }

    @Override
    public void CreateUser(User u) {
        UserList.add(u);
    }

    public List<User> getUsers () {
        return UserList;
    }
}
