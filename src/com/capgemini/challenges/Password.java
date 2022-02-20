package com.capgemini.challenges;

public class Password {

    public int checkPasswordLength(String password) {

        if (password.length() < 6)
            return (6 - password.length());
        return 0;
    }
}
