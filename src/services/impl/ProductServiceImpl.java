package services.impl;

import model.Product;
import services.ProductService;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct() {
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

   /* @Override
    public String toString(Product product){
        return "Название: " + product.getProductName() + "\n"
                + "Стоимость: " + product.getProductValue() + " грн." + "\n"
                + "ID продукта в базе магазина: " + product.hashCode() + "\n"
                + "Индекс элемента в коллекции: № " + products.indexOf(product) + "\n"
                + "Вес еденицы продукта: " + product.getProductWeight() + " г." + "\n"
                + "Объем единицы продукта: " + product.getProductVolume() + " см.куб." + "\n"
                + "Дата изготовления данной единицы продукта: " + product.getProductAgeManufacture();
    }*/
}
