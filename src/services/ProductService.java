package services;

import model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProductService {

    void addProduct() throws IOException;

    void showAllProducts() throws IOException;

    void removeProduct() throws IOException;;

    void modifyProduct() throws IOException;;

    void findProduct() throws IOException;;

    void saveProductBase() throws IOException;

    void loadProductBase() throws IOException;

    void clearProductBase();

    String productToString(Product product);

    String baseConvertToFile(Product product);

    int readNumber() throws IOException;

}
