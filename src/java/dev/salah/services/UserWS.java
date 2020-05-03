package dev.salah.services;

import dev.salah.ws.Bookstore;
import dev.salah.ws.Bookstore_Service;
import dev.salah.ws.User;
import java.util.List;

public class UserWS {

    private static Bookstore_Service service = new Bookstore_Service();
    private static Bookstore client = service.getBookstorePort();

    public static void create(User user) {
        client.createUser(user);
    }

    public static List<User> read() {
        return client.findAllUsers();
    }

    public static User read(String id) {
        return client.findUser(id);
    }

    public static User readByEmail(String email) {
        return client.findByEmail(email);
    }

    public static void update(User user) {
        client.editUser(user);
    }

    public static void delete(String id) {
        client.removeUser(id);
    }
}
