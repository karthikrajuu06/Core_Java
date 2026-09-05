package Exceptions;


class InvaliPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class PasswordLength {

    static void checkPassword(String password) throws InvalidAttributeValueException {
        if (password.length() < 8) {
            throw new Exception(
                "Password must contain at least 8 characters"
            );
        }

        System.out.println("Password is valid");
    }

    public static void main(String[] args) {
        String password = "Java123";

        try {
            checkPassword(password);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
