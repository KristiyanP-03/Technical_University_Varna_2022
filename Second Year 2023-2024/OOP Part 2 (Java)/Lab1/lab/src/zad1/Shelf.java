package zad1;

import zad1.Product;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Product> products;

    public Shelf() {
        this.products = new ArrayList<>();
    }



    public void addProduct(Product product) {
        products.add(product);
    }



    public List<Product> getProducts() {
        return products;
    }
}

