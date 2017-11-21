package model;

public class Product {

    private String productName;
    private int productId;
    private double productValue;
    private double productWeight;
    private double productVolume;
    private int productAgeManufacture;

    public Product(String productName, int productId, double productValue, double productWeight, double productVolume, double productDiscount, int productAgeManufacture) {
        this.productName = productName;
        this.productId = productId;
        this.productValue = productValue;
        this.productWeight = productWeight;
        this.productVolume = productVolume;
        this.productAgeManufacture = productAgeManufacture;
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

    public int getProductAgeManufacture() {
        return productAgeManufacture;
    }

    public void setProductAgeManufacture(int productAgeManufacture) {
        this.productAgeManufacture = productAgeManufacture;
    }
}
