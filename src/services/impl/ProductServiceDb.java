package services.impl;

import DAO.ProductDao;
import model.Product;
import services.ProductService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ProductServiceDb implements ProductService {

    private ProductDao productDao;
    private BufferedReader reader;

    public ProductServiceDb() throws IOException {
        this.productDao = new ProductDao();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void addProduct() throws IOException {
        System.out.println("Enter ID:");
        int id = readNumber();
        System.out.println("Enter name:");
        String name = reader.readLine();
        System.out.println("Enter number:");
        int number = readNumber();
        System.out.println("Enter value:");
        int value = readNumber();
        System.out.println("Enter weight:");
        int weight = readNumber();
        System.out.println("Enter volume:");
        int volume = readNumber();
        productDao.addProduct(new Product(id, name, number, value, weight, volume));
    }

    @Override
    public void removeProduct() throws IOException {

    }

    @Override
    public void modifyProduct() throws IOException {
        System.out.println("Enter ID:");
        int id = readNumber();
        System.out.println("Enter name:");
        String name = reader.readLine();
        System.out.println("Enter surname:");
        String surname = reader.readLine();
        System.out.println("Enter number:");
        int number = readNumber();
        System.out.println("Enter value:");
        int value = readNumber();
        System.out.println("Enter weight:");
        int weight = readNumber();
        System.out.println("Enter volume:");
        int volume = readNumber();
        productDao.updateProduct(new Product(id, name, number, value, weight, volume));
    }

    @Override
    public void findProduct() throws IOException {

    }

    @Override
    public List<Product> showAllProducts(){
        return productDao.getAll();
    }

    private int readNumber() throws IOException {
        int id;
        while (true) {
            try {
                id = Integer.valueOf(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter the number!");
            }
        }
        return id;
    }
    public void removeProduct(Product product){

    }

    public void findProduct(Product product){

    }
}
