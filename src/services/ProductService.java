package services;

import model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProductService {

    void addProduct() throws IOException;

    void removeProduct() throws IOException;;

    void modifyProduct() throws IOException;;

    void findProduct() throws IOException;;

    void saveProductBase() throws FileNotFoundException;

    void loadProductBase() throws FileNotFoundException;

    String toString(Product product);

}
