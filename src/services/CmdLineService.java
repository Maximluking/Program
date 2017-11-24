package services;

import model.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdLineService {

    private final BufferedReader reader;
    private final ClientService clientService;
    private final ProductService productService;

    public CmdLineService(ClientService clientService, ProductService productService) {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.productService = productService;
        this.clientService = clientService;
    }

    private static void showMainMenu(){
        System.out.println("1. Работа с клиентами");
        System.out.println("2. Работа с продуктом");
        System.out.println("3. Выход из программы");
    }

    private static void showClientMenu(){
        System.out.println("1. Добавить нового клиента");
        System.out.println("2. Удалить клиента");
        System.out.println("3. Изменить данные клиента");
        System.out.println("4. Найти клиента по параметрам");
        System.out.println("5. Вернутся назад");
    }

    private static void showProductMenu(){
        System.out.println("1. Добавить новый продукт");
        System.out.println("2. Удалить продукт");
        System.out.println("3. Изменить данные продукта");
        System.out.println("4. Найти продукт по параметрам");
        System.out.println("5. Вернутся назад");
    }

    public void mainMenu() throws IOException {
        boolean isWork = true;
        do {
            showMainMenu();
            String s = reader.readLine();
            switch (s){
                case "1":
                    clientMenu();
                    break;
                case "2":
                    productMenu();
                    break;
                case "3":
                    isWork = false;
                    break;
                default:
                    System.out.println("Неправильный ввод \n");
            }
        }
        while (isWork);
    }
    private void clientMenu() throws IOException {
        boolean isWork = true;
        do {
            showClientMenu();
            String s = reader.readLine();
            switch (s) {
                case "1":
                    clientService.serviceGetNewClient();
                    break;
                case "2":
                    clientService.removeClient();
                    break;
                case "3":
                    clientService.modifyClient();
                    break;
                case "4":
                    clientService.findClient();
                    break;
                case "5":
                    isWork = false;
                default:
                    System.out.println("Неправильный ввод \n");
            }
        }
        while (isWork);
    }

    private void productMenu() throws IOException {
        boolean isWork = true;
        do {
            showProductMenu();
            String s = reader.readLine();
            switch (s) {
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    productService.removeProduct();
                    break;
                case "3":
                    productService.modifyProduct();
                    break;
                case "4":
                    productService.findProduct();
                    break;
                case "5":
                    isWork = false;
                default:
                    System.out.println("Неправильный ввод \n");
            }
        }
        while (isWork);
    }

}
