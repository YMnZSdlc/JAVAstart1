package pl.sda.javastart.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    //prepare
    //act
    //assert

    @Test
    void testToString() {
        User firstUser = new User("Adam", "adam", "1234");
        String firstUserTest = firstUser.toString();

        assert !firstUserTest.contains("1234");
    }


}