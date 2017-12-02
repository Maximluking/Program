package services.impl;

import model.Product;
import services.ProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    private BufferedReader reader;
    private List<Product> products;
    private BufferedWriter bw;
    private BufferedReader br;


    public ProductServiceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.products = new ArrayList<>();
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
        products.add(new Product(id, name, number, value, weight, volume));
    }

    @Override
    public void showAllProducts(){
        if(products.isEmpty()){
            System.out.println("Base empty!\n");
        }else {
            System.out.println("All products:\n");
            for (Product product : products) {
                System.out.println(productToString(product));
            }
        }
    }

    @Override
    public void removeProduct() throws IOException {
        if(products.isEmpty()){
            System.out.println("Base empty!\n");
        }else {
            System.out.println("Enter ID to DELETE from BASE:\n");
            int id = readNumber();
            Boolean flag = true;
            for(Product product: products){
                if(product.getProductId() == id){
                    products.remove(product);
                    System.out.println("Product deleted");
                    flag = false;
                }
            }
            if(flag) System.out.println("there is no product with this ID\n");
        }
    }

    @Override
    public void modifyProduct() throws IOException {
        if(products.isEmpty()){
            System.out.println("Base empty!\n");
        }else {
            System.out.println("Enter ID for change INFO:\n");
            int id = readNumber();
            Boolean flag = true;
            for(Product product: products) {
                if (product.getProductId() == id) {
                    do {
                        System.out.println("Select the parameter to change:\n 1) Name.\n 2) Number.\n 3) Value.\n 4) Weight.\n 5) Volume\n 6) Exit.\n");
                        String s = reader.readLine();
                        switch (s) {
                            case "1":
                                System.out.println("Enter name:");
                                product.setProductName(reader.readLine());
                                break;
                            case "2":
                                System.out.println("Enter number:");
                                product.setProductNumber(readNumber());
                                break;
                            case "3":
                                System.out.println("Enter value:");
                                product.setProductValue(readNumber());
                                break;
                            case "4":
                                System.out.println("Enter weight:\n");
                                product.setProductWeight(readNumber());
                                break;
                            case "5":
                                System.out.println("Enter volume:\n");
                                product.setProductVolume(readNumber());
                                break;
                            case "6":
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid input!\n");
                        }
                    } while (flag);
                }
            }
            if(flag) System.out.printf("Product with this ID = %s is not found", id);
        }
    }

    @Override
    public void findProduct() throws IOException {
        if(products.isEmpty()){
            System.out.println("Base empty!\n");
        }else{
            Boolean flag = true;
            Boolean containsParam = false;
            do{
                System.out.println("Select the parameter to search:\n 1) ID.\n 2) Name.\n 3) Exit.\n");
                String s = reader.readLine();
                switch (s) {
                    case "1":
                        System.out.println("Enter ID:");
                        int id = readNumber();
                        for(Product product: products) {
                            if (product.getProductId() == id) {
                                System.out.println("Coincidence:\n" + productToString(product));
                                containsParam = true;
                            }
                        }
                        break;
                    case "2":
                        System.out.println("Enter name:");
                        String name = reader.readLine();
                        for(Product product: products) {
                            if (name.equals(product.getProductName())) {
                                System.out.println("Coincidence:\n" + productToString(product));
                                containsParam = true;
                            }
                        }
                        break;
                    case "3":
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid input!\n");
                }
                if(!containsParam) {
                    System.out.println("Product not found!\n");
                    containsParam = true;
                }
            }while (flag);
        }
    }

    @Override
    public void saveProductBase() throws IOException {
        if (products.isEmpty()) {
            System.out.println("Base empty!");
        } else {
            File tempFile = new File("ProductBase.txt");
            bw = new BufferedWriter(new FileWriter(tempFile));
            for (Product product:products) {
                bw.write(baseConvertToFile(product));
            }
            bw.close();
            System.out.printf("BASE is saved successfully to file: %s\n", tempFile.getAbsolutePath());
        }

    }

    @Override
    public void loadProductBase() throws IOException {
        File tempFile = new File("ProductBase.txt");
        br = new BufferedReader(new FileReader(tempFile));
        String line;
        while ((line = br.readLine())!=null){
            int id = Integer.parseInt(line);
            String name = br.readLine();
            int number  = Integer.parseInt(br.readLine());
            int value = Integer.parseInt(br.readLine());
            int weight = Integer.parseInt(br.readLine());
            int volume = Integer.parseInt(br.readLine());
            products.add(new Product(id, name, number, value, weight, volume));
        }
        br.close();
        System.out.println("File is load successfully!\n");
    }

    @Override
    public void clearProductBase() {
        System.out.println("Base clear successfully!\n");
        products.clear();
    }

    @Override
    public int readNumber() throws IOException {
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

    @Override
    public String productToString(Product product){
        return "ID: " + product.getProductId() + "\n"
                + "Name: " + product.getProductName() + "\n"
                + "Number: " + product.getProductNumber() + "\n"
                + "Value: " + product.getProductValue() + "\n"
                + "Weight: " + product.getProductWeight() + "\n"
                + "Volume: " + product.getProductVolume() + "\r\n";
    }

    @Override
    public String baseConvertToFile(Product product) {
        return product.getProductId() + "\r\n"
                + product.getProductName() + "\r\n"
                + product.getProductNumber() + "\r\n"
                + product.getProductValue() + "\r\n"
                + product.getProductWeight() + "\r\n"
                + product.getProductVolume() + "\r\n";
    }
}
