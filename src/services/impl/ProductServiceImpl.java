package services.impl;

import model.Product;
import services.ProductService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

    private BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct() throws IOException {
            System.out.println("Введите название для нового товара:\n");
            String name = reader.readLine();
            System.out.println("Введите количество едениц данного товара:\n");
            int number = Integer.parseInt(reader.readLine());
            System.out.println("Введите стоимость еденицы продукта в грн.:\n");
            double value = Double.parseDouble(reader.readLine());
            System.out.println("Введите вес единицы продукта в кг:\n");
            double weight = Double.parseDouble(reader.readLine());
            System.out.println("Введите объем единицы продуктав см.куб.:\n");
            double volume = Double.parseDouble(reader.readLine());;
            products.add(new Product(name, number, value, weight, volume));
    }

    @Override
    public void removeProduct() {
    }

    @Override
    public void modifyProduct() {
    }

    @Override
    public void findProduct() {
    }

   @Override
    public String toString(Product product){
        return "Название: " + product.getProductName() + "\n"
                + "Количество едениц данното товара: " + product.getNumber() + "\n"
                + "Стоимость: " + product.getProductValue() + " грн." + "\n"
                + "ID продукта в базе магазина: " + product.hashCode() + "\n"
                + "Индекс элемента в коллекции: № " + products.indexOf(product) + "\n"
                + "Вес еденицы продукта: " + product.getProductWeight() + " г." + "\n"
                + "Объем единицы продукта: " + product.getProductVolume() + " см.куб.";
    }
}
