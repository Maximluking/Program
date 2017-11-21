package services;

import model.Shop;

public interface ShopService {

    void addShop();

    void removeShop();

    void modifyShop();

    void findShop();

    String toString(Shop shop);
}
