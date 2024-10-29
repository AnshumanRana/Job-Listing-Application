package net.engineeringdigest.journalApp.Service;

import net.engineeringdigest.journalApp.Repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {

    private final UserRepository userRepository;
    @Autowired
    public  UserServiceTest(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @ParameterizedTest
    @Disabled
//    @Test
    @CsvSource({
            "ram","shayam"
    })
    public void testFindByUserName(String name){
        assertNotNull(userRepository.findByUserName(name));
//        assertEquals(4,2+1);
    }
    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,2,4",
            "1,1,3"
    })
    public void test(int a,int b,int expected){
        assertEquals(expected,a+b);

    }
}
