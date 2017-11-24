package model;

public class Product {

    private int productId;
    private String productName;
    private double productValue;
    private double productWeight;
    private double productVolume;

    public Product(int productId, String productName, double productValue, double productWeight, double productVolume) {
        this.productId = productId;
        this.productName = productName;
        this.productValue = productValue;
        this.productWeight = productWeight;
        this.productVolume = productVolume;
    }

  /*  public Product() {

        System.out.println("Введите название для нового товара: ");
        this.productName = ;
        this.productId = this.hashCode();
        System.out.println("Введите стоимость еденицы продукта в грн.: ");
        this.productValue = ;
        System.out.println("Введите вес единицы продукта в граммах: ");
        this.productWeight = ;
        System.out.println("Введите объем единицы продуктав см.куб.: ");
        this.productVolume = ;
        System.out.println("Введите дату изготовления данной единицы продукта: ");

        System.out.println("Вы добавили в базу следующий продукт: \n");
        System.out.println("Название: " + this.productName);
        System.out.println("Стоимость: " + this.productValue + " грн.");
        System.out.println("ID продукта в базе магазина: " + this.productId);
        System.out.println("Вес еденицы продукта в граммах: " + this.productWeight + " г.");
        System.out.println("Объем единицы продукта в сантиметрах кубических: " + this.productVolume + " см.куб.");
        System.out.println("Дата изготовления данной единицы продукта: " + this.productAgeManufacture);
    }*/

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
}
