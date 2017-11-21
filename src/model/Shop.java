package model;

import services.CmdLineGetInfo;

public class Shop {

    private String shopName;
    private String shopAdress;
    private int shopID;

    public Shop() {
        System.out.println("Введите название для магазина: ");
        this.shopName = CmdLineGetInfo.cmdLineGetString();
        System.out.println("Введите адресс магазина: ");
        this.shopAdress = CmdLineGetInfo.cmdLineGetString();
        this.shopID = this.hashCode();

        System.out.println("Вы добавили в базу следующий магазин:");
        System.out.println("Название: " + this.shopName);
        System.out.println("Адресс: " + this.shopAdress);
        System.out.println("ID продукта в базе магазина: " + this.shopID);

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
