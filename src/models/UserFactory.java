package models;

public class UserFactory {

    public static User createUser(String id, String name, String email, String phoneNumber, String password, String userType) {
        switch (userType.toLowerCase()) {
            case "admin":
                return new Admin(id, name, email, phoneNumber, password);
            case "customer":
                return new Customer(id, name, email, phoneNumber, password);
            default:
                throw new IllegalArgumentException("Unknown user type: " + userType);
        }
    }
}
