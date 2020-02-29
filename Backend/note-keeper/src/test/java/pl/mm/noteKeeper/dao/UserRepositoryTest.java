package pl.mm.noteKeeper.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.mm.noteKeeper.model.User;
import pl.mm.noteKeeper.testDataBuilder.ModelUsersTestDataBuilder;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUserRepository() {
        //given
        User user = ModelUsersTestDataBuilder.standardUser();

        //when
        user = userRepository.save(user);

        //then
        User loadedUser = userRepository.findById(user.getId()).orElse(null);

        Assertions.assertNotNull(loadedUser);
    }

}