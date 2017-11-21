package services;

import services.impl.ClientServiceImpl;
import services.impl.ProductServiceImpl;
import services.impl.ShopServiceImpl;

public class CmdLineService {

    ClientService clientService = new ClientServiceImpl();
    ProductService productService = new ProductServiceImpl();
    ShopService shopService = new ShopServiceImpl();

    public CmdLineService(){
    }

    public void showMainMenu(){
        System.out.println("1. Работа с клиентами");
        System.out.println("2. Работа с продуктом");
        System.out.println("3. Работа с торговой точкой");
        System.out.println("4. Выход из программы");

    }
    public void showClientMenu(){
        System.out.println("1. Добавить нового клиента");
        System.out.println("2. Удалить клиента");
        System.out.println("3. Изменить данные клиента");
        System.out.println("4. Найти клиента по параметрам");
        System.out.println("5. Вернутся назад");
    }
    public void showProductMenu(){
        System.out.println("1. Добавить новый продукт");
        System.out.println("2. Удалить продукт");
        System.out.println("3. Изменить данные продукта");
        System.out.println("4. Найти продукт по параметрам");
        System.out.println("5. Вернутся назад");
    }
    public void showShopMenu(){
        System.out.println("1. Добавить новый магазин");
        System.out.println("2. Удалить магазин");
        System.out.println("3. Изменить данные магазина");
        System.out.println("4. Найти магазин по параметрам");
        System.out.println("5. Вернутся назад");
    }
    public int readCommand(){
       return CmdLineGetInfo.cmdLineGetInt();
    }

    public void menuStart(){
        boolean isWork = true;
        do {
            showMainMenu();
            int s = readCommand();
            switch (s){
                case 1:
                    while (isWork==true) {
                        showClientMenu();
                        int s1 = readCommand();
                        switch (s1) {
                            case 1:
                                clientService.addClient();
                                System.out.println();
                                break;
                            case 2:
                                clientService.removeClient();
                                break;
                            case 3:
                                clientService.modifyClient();
                                break;
                            case 4:
                                clientService.findClient();
                                break;
                            case 5:
                                isWork = false;
                            default:
                                System.out.println("Неправильный ввод \n");
                        }
                    }
                    isWork = true;
                    continue;
                case 2:
                    while (isWork==true) {
                        showProductMenu();
                        int s2 = readCommand();
                        switch (s2) {
                            case 1:
                                productService.addProduct();
                                break;
                            case 2:
                                productService.removeProduct();
                                break;
                            case 3:
                                productService.modifyProduct();
                                break;
                            case 4:
                                productService.findProduct();
                                break;
                            case 5:
                                isWork = false;
                            default:
                                System.out.println("Неправильный ввод \n");
                        }
                    }
                    isWork = true;
                    continue;
                case 3:
                    while (isWork == true) {
                        showShopMenu();
                        int s3 = readCommand();
                        switch (s3) {
                            case 1:
                                shopService.addShop();
                                break;
                            case 2:
                                shopService.removeShop();
                                break;
                            case 3:
                                shopService.modifyShop();
                                break;
                            case 4:
                                shopService.findShop();
                                break;
                            case 5:
                                isWork = false;
                            default:
                                System.out.println("Неправильный ввод \n");
                        }
                    }
                    isWork = true;
                    continue;
                case 4:
                    isWork = false;
                    break;
                default:
                    System.out.println("Неправильный ввод \n");
            }
        }
        while (isWork);
    }
}
