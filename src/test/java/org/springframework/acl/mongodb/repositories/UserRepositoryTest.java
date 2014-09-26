package org.springframework.acl.mongodb.repositories;

import org.junit.runner.RunWith;
import org.springframework.acl.mongodb.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:security-context.xml"})
@WebAppConfiguration
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    public void create() {
        User user = new User();
        user.setKey("admin");
        this.userRepository.save(user);

    }
}