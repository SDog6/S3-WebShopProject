package UserTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import project.Models.user_class.User;
import project.fakedatabase.FakeUserData;

@ContextConfiguration
public class UserCRUDTest {

    @Test
    public void CreateTest()
    {
        FakeUserData fake = new FakeUserData();

        fake.CreateUser(new User("test","test"));

        Assertions.assertEquals(fake.getUsers().size(),1);

    }
}
