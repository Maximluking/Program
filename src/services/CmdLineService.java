package services;

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
        System.out.println("5. Сохранить базу клиентов в файл");
        System.out.println("6. Загрузить базу клиентов из файла");
        System.out.println("7. Вернутся назад");
    }

    private static void showProductMenu(){
        System.out.println("1. Добавить новый продукт");
        System.out.println("2. Удалить продукт");
        System.out.println("3. Изменить данные продукта");
        System.out.println("4. Найти продукт по параметрам");
        System.out.println("5. Сохранить базу клиентов в файл");
        System.out.println("6. Загрузить базу клиентов из файла");
        System.out.println("7. Вернутся назад");
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
                    clientService.addClient();
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
                    clientService.saveClientBase();
                    break;
                case "6":
                    clientService.loadClientBase();
                    break;
                case "7":
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
                    productService.saveProductBase();
                    break;
                case "6":
                    productService.loadProductBase();
                    break;
                case "7":
                    isWork = false;
                default:
                    System.out.println("Неправильный ввод \n");
            }
        }
        while (isWork);
    }

}
