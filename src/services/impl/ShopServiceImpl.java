package services.impl;

import model.Shop;
import services.CmdLineGetInfo;
import services.ShopService;
import java.util.ArrayList;
import java.util.List;

public class ShopServiceImpl implements ShopService {

    List<Shop> shops = new ArrayList<>();

    @Override
    public void addShop() {
        shops.add(new Shop());
        System.out.println();
    }

    @Override
    public void removeShop() {
        System.out.println("Текущий полный список магазинов: \n");
        for (Shop shop : shops) {
            System.out.println(toString(shop) + "\n");
        }
        System.out.println("\n Укажите индекс элемента коллекции для удаления соответствующеей магазина из базы: ");
        shops.remove(CmdLineGetInfo.cmdLineGetInt());
        System.out.println("Текущий полный список магазинов после редактирования базы: \n");
        for (Shop shop : shops) {
            System.out.println(toString(shop) + "\n");
        }
        System.out.println();
    }

    @Override
    public void modifyShop() {
        System.out.println("Текущий полный список магазинов: \n");
        for (Shop shop: shops) {
            System.out.println(toString(shop) + "\n");
        }
        System.out.println("Укажите индекс элемента коллекции для изменения данных соответствующеего магазина из базы и после этого вводите новые данные: ");
        shops.set(CmdLineGetInfo.cmdLineGetInt(), new Shop());
        System.out.println("Текущий полный список магазинов после редактирования базы: \n");
        for (Shop shop: shops) {
            System.out.println(toString(shop) + "\n");
        }
        System.out.println();
    }

    @Override
    public void findShop() {
        System.out.println("Введите название искомого магазина: \n");
        String name = CmdLineGetInfo.cmdLineGetString();
        for (Shop shop: shops) {
            if(name.equals(shop.getShopName())){
                System.out.println("Найдено совпадение: \n" + toString(shop));
            }else System.out.println("Совпадений не найдено!");
        }
        System.out.println();
    }

    @Override
    public String toString(Shop shop) {
        return "Название: " + shop.getShopName() + "\n"
                + "Адресс: " + shop.getShopAdress() + "\n"
                + "ID магазина: " + shop.hashCode();
    }
}
