package model;

public class Product {
    private int productId;
    private String productName;
    private int productNumber;
    private int productValue;
    private int productWeight;
    private int productVolume;

    public Product(int productId, String productName, int productNumber, int productValue, int productWeight, int productVolume) {
        this.productId = productId;
        this.productName = productName;
        this.productNumber = productNumber;
        this.productValue = productValue;
        this.productWeight = productWeight;
        this.productVolume = productVolume;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductValue() {
        return productValue;
    }

    public void setProductValue(int productValue) {
        this.productValue = productValue;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public int getProductVolume() {
        return productVolume;
    }

    public void setProductVolume(int productVolume) {
        this.productVolume = productVolume;
    }

    public String productToString(Product product){
        return "ID: " + product.getProductId() + "\n"
                + "Name: " + product.getProductName() + "\n"
                + "Number: " + product.getProductNumber() + "\n"
                + "Value: " + product.getProductValue() + "\n"
                + "Weight: " + product.getProductWeight() + "\n"
                + "Volume: " + product.getProductVolume() + "\r\n";
    }
}
