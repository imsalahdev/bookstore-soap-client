package dev.salah.services;

import dev.salah.ws.Bookstore;
import dev.salah.ws.Bookstore_Service;
import dev.salah.ws.Category;
import java.util.List;

public class CategoryWS {

    private static Bookstore_Service service = new Bookstore_Service();
    private static Bookstore client = service.getBookstorePort();

    public static void create(Category category) {
        client.createCategory(category);
    }

    public static List<Category> read() {
        return client.findAllCategories();
    }

    public static Category read(String id) {
        return client.findCategory(id);
    }

    public static void update(Category category) {
        client.editCategory(category);
    }

    public static void delete(String id) {
        client.removeCategory(id);
    }
}
