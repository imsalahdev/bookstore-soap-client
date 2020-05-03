package dev.salah.services;

import java.util.List;
import java.util.stream.Collectors;
import dev.salah.Utils;
import dev.salah.ws.Book;
import dev.salah.ws.Bookstore;
import dev.salah.ws.Bookstore_Service;
import dev.salah.ws.Category;
import java.util.ArrayList;

public class BookWS {

    private static Bookstore_Service service = new Bookstore_Service();
    private static Bookstore client = service.getBookstorePort();

    public static void create(Book book) {
        client.createBook(book);
    }

    public static List<Book> read() {
        return client.findAllBooks();
    }

    public static Book read(String id) {
        return client.findBook(id);
    }

    public static List<Book> read(List<String> ids) {
        List<Book> books = new ArrayList<Book>();
        for (String id : ids) {
            books.add(read(id));
        }
        return books;
    }
//    
//    public static List<Book> readByCategoryID(Integer id) {
//        List<Book> books = read();
//        books.removeIf(book -> book.getCategoryID().getId() != id);
//        return books;
//    }

    public static List<Book> readByCategoryID(Integer id) {
        return client.findByCategoryID(id);
    }

//    public static List<Book> readByCategoryID(Integer id) {
//        return null;
//    }
//    
//    public static String count() {
//        return client.countREST();
//    }
    public static void update(Book book) {
        client.editBook(book);
    }

    public static void delete(String id) {
        client.removeBook(id);
    }
}
