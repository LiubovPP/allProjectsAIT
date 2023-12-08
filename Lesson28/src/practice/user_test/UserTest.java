package practice.user_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    final String email = "peter@gmail.com"; // final - переменная стала статической
    final String password = "12345Az!"; // final - переменная стала статической

    @BeforeEach
    void setUp() {
        user = new User(email, password); // перед каждым тестом
    }

    @Test
    void testCorrectEmail() {
        user.setEmail("peter@yahoo.com");// устанавливаем новый e-mail
        assertEquals("peter@yahoo.com", user.getEmail());
    }

    @Test
    void setEmailWithoutAt() {
        user.setEmail("peter.yahoo.com");
        assertEquals(email, user.getEmail());//если совпадут, то адрес валидацию не прошел
    }
    @Test
    void setEmailDotAfterAt() {
        user.setEmail("peter@yahoo.c.om");
        assertEquals(email, user.getEmail());//если совпадут, то адрес валидацию не прошел
    } //



}