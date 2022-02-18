package com.capgemini;

import com.capgemini.challenges.Password;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    private final Password password = new Password();

    @Test
    @DisplayName("Password = 'Ya3&ab' return 0")
    void checkPasswordLength() {
        assertEquals(0, password.checkPasswordLength("Ya3&ab"));
    }

    @Test
    @DisplayName("Password = 'Ya3' return 3")
    void checkPasswordLength2() {
        assertEquals(3, password.checkPasswordLength("Ya3"));
    }

    @Test
    @DisplayName("Password = '' return 6")
    void checkPasswordLength3() {
        assertEquals(6, password.checkPasswordLength(""));
    }
}
