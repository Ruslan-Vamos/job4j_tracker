package ru.job4j.early;

public class PasswordValidator {

    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be in length [8, 32]");
        }

        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                hasUpCase = true;
            }
            if (Character.isLowerCase(symbol)) {
                hasLowCase = true;
            }
            if (Character.isDigit(symbol)) {
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(symbol)) {
                hasSpecial = true;
            }
        }

        if (!hasUpCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!hasLowCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        for (int i = 0; i < FORBIDDEN.length; i++) {
            String forbidden = FORBIDDEN[i];
            for (int j = 0; j < password.length(); j++) {
                if (password.length() - j < forbidden.length()) {
                    continue;
                }
                int index = 0;
                for (int k = j; k < password.length(); k++) {
                    if (Character.toLowerCase(forbidden.charAt(index)) != Character.toLowerCase(password.charAt(k))) {
                        continue;
                    }
                    if (index == forbidden.length() - 1) {
                        throw new IllegalArgumentException(
                                "Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
                    }
                    index++;
                }
            }
        }

        return password;
    }
}