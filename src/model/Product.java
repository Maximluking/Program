package model;

public class Product {

    private String productName;
    private int number;
    private double productValue;
    private double productWeight;
    private double productVolume;

    public Product(String productName, int number, double productValue, double productWeight, double productVolume) {
        this.productName = productName;
        this.number = number;
        this.productValue = productValue;
        this.productWeight = productWeight;
        this.productVolume = productVolume;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
}
