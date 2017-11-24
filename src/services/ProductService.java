package services;

import model.Product;

import java.io.IOException;

public interface ProductService {

    void addProduct() throws IOException;

    void removeProduct();

    void modifyProduct();

    void findProduct();

    String toString(Product product);

}
