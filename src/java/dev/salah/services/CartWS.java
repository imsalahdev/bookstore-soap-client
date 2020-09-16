package dev.salah.services;

import dev.salah.ws.Bookstore;
import dev.salah.ws.Bookstore_Service;
import dev.salah.ws.Cart;
import dev.salah.ws.User;
import java.util.List;

public class CartWS {

    private static final Bookstore_Service service = new Bookstore_Service();
    private static final Bookstore client = service.getBookstorePort();

    public static void create(Cart cart) {
        if (readByCart(cart.getUserId().getId(), cart.getBookId().getId()) == null) {
            client.createCart(cart);
        }
    }

    public static void create(User user, List<String> bookIDs) {
        bookIDs.stream().map(id -> {
            final Cart cart = new Cart();
            cart.setUserId(user);
            cart.setBookId(BookWS.read(id));
            return cart;
        }).forEachOrdered(cart -> {
            create(cart);
        });
    }

    public static Cart readByCart(Integer uid, Integer bid) {
        return client.findByCart(uid, bid);
    }

    public static void removeByUserID(Integer uid) {
        client.removeByUserID(uid);
    }

    public static void removeByCart(Integer uid, Integer bid) {
        client.removeByCart(uid, bid);
    }

    public static List<Cart> readByUserId(Integer uid) {
        return client.findByUserId(uid);
    }
}
