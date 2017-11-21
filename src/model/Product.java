package model;

import services.CmdLineGetInfo;

public class Product {

    private String productName;
    private int productId;
    private double productValue;
    private double productWeight;
    private double productVolume;
    private String productAgeManufacture;

    public Product() {
        System.out.println("Введите название для нового товара: ");
        this.productName = CmdLineGetInfo.cmdLineGetString();
        this.productId = this.hashCode();
        System.out.println("Введите стоимость еденицы продукта: ");
        this.productValue = CmdLineGetInfo.cmdLineGetInt();
        System.out.println("Введите вес единицы продукта: ");
        this.productWeight = CmdLineGetInfo.cmdLineGetInt();
        System.out.println("Введите объем единицы продукта: ");
        this.productVolume = CmdLineGetInfo.cmdLineGetInt();
        System.out.println("Введите дату изготовления данной единицы продукта: ");
        this.productAgeManufacture = CmdLineGetInfo.cmdLineGetString();

        System.out.println("Вы добавили в базу следующего продукт:");
        System.out.println("Название: " + this.productName);
        System.out.println("Стоимость: " + this.productValue);
        System.out.println("ID продукта в базе магазина: " + this.productId );
        System.out.println("Вес еденицы продукта: " + this.productWeight + " г.");
        System.out.println("Объем единицы продукта: " + this.productVolume + " см.куб.");
        System.out.println("Дата изготовления данной единицы продукта: " + this.productAgeManufacture);
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductValue() {
        return productValue;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public double getProductVolume() {
        return productVolume;
    }

    public void setProductVolume(double productVolume) {
        this.productVolume = productVolume;
    }

    public String getProductAgeManufacture() {
        return productAgeManufacture;
    }

    public void setProductAgeManufacture(String productAgeManufacture) {
        this.productAgeManufacture = productAgeManufacture;
    }
}
