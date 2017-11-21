package services.impl;

import model.Product;
import services.CmdLineGetInfo;
import services.ProductService;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct() {
        products.add(new Product());
        System.out.println();
    }

    @Override
    public void removeProduct() {
        System.out.println("Текущий полный список продуктов магазина: \n");
        for (Product product: products) {
            System.out.println(toString(product));
            System.out.println();
        }
        System.out.println("\n Укажите индекс элемента коллекции для удаления соответствующеей идиницы продукта из базы: ");
        products.remove(CmdLineGetInfo.cmdLineGetInt());
        System.out.println("Текущий полный список продуктов магазина после редактирования базы: \n");
        for (Product product: products) {
            System.out.println(toString(product));
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void modifyProduct() {
        System.out.println("Текущий полный список продуктов магазина:");
        for (Product product: products) {
            System.out.println(toString(product));
            System.out.println();
        }
        System.out.println("Укажите индекс элемента коллекции для изменения данных соответствующеей единицы продукта из базы и после этого вводите новые данные: ");
        products.set(CmdLineGetInfo.cmdLineGetInt(), new Product());
        System.out.println("Текущий полный список продуктов магазина после редактирования базы: \n");
        for (Product product: products) {
            System.out.println(toString(product));
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void findProduct() {
        System.out.println("Введите название искомого продукта: \n");
        String name = CmdLineGetInfo.cmdLineGetString();
        for (Product product: products) {
            if(name.equals(product.getProductName())){
                System.out.println("Найдено совпадение: \n" + toString(product));
            }else System.out.println("Совпадений не найдено!");
        }
        System.out.println();
    }

    @Override
    public String toString(Product product){
        return "Название: " + product.getProductName() + "\n"
                + "Стоимость: " + product.getProductValue() + " грн." + "\n"
                + "ID продукта в базе магазина: " + product.hashCode() + "\n"
                + "Индекс элемента в коллекции: № " + products.indexOf(product) + "\n"
                + "Вес еденицы продукта: " + product.getProductWeight() + " г." + "\n"
                + "Объем единицы продукта: " + product.getProductVolume() + " см.куб." + "\n"
                + "Дата изготовления данной единицы продукта: " + product.getProductAgeManufacture();
    }
}
