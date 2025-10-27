package EcommerceLayered.Database;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private List<String> product;

    public void connect() {
        product = new ArrayList<>();
        System.out.println("DB connected");
    }

    public void addProduct(String Product) {
        product.add(Product);
    }

    public List<String> listAll() {
        return product;
    }

    public void disconnect() {
        System.out.println("Database Disconnected");
    }
}

