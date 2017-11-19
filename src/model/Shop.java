package model;

public class Shop {

    private String shopName;
    private String shopAdress;
    private int shopID;

    public Shop(String shopName, String shopAdress, int shopID) {
        this.shopName = shopName;
        this.shopAdress = shopAdress;
        this.shopID = shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAdress() {
        return shopAdress;
    }

    public void setShopAdress(String shopAdress) {
        this.shopAdress = shopAdress;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }
}
