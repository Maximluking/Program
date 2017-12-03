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
        System.out.println("1. Clients");
        System.out.println("2. Products");
        System.out.println("3. Exit");
    }

    private static void showClientMenu(){
        System.out.println("1. Add client");
        System.out.println("2. Show all clients");
        System.out.println("3. Remove client");
        System.out.println("4. Change INFO of client");
        System.out.println("5. Find client");
        System.out.println("6. Save BASE to file");
        System.out.println("7. Load BASE from file");
        System.out.println("8. Clear BASE in RAM");
        System.out.println("9. Go back");
    }

    private static void showProductMenu(){
        System.out.println("1. Add product");
        System.out.println("2. Show all products");
        System.out.println("3. Remove product");
        System.out.println("4. Change INFO of product");
        System.out.println("5. Find product");
        System.out.println("6. Save BASE to file");
        System.out.println("7. Load BASE from file");
        System.out.println("8. Clear BASE in RAM");
        System.out.println("9. Go back");
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
                    System.out.println("Invalid input!\n");
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
                    clientService.showAllClients();
                    break;
                case "3":
                    clientService.removeClient();
                    break;
                case "4":
                    clientService.modifyClient();
                    break;
                case "5":
                    clientService.findClient();
                    break;
                case "6":
                    clientService.saveClientBase();
                    break;
                case "7":
                    clientService.loadClientBase();
                    break;
                case "8":
                    clientService.clearClientBase();
                    break;
                case "9":
                    isWork = false;
                    break;
                default:
                    System.out.println("Invalid input!\n");
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
                    productService.showAllProducts();
                    break;
                case "3":
                    productService.removeProduct();
                    break;
                case "4":
                    productService.modifyProduct();
                    break;
                case "5":
                    productService.findProduct();
                    break;
                case "6":
                    productService.saveProductBase();
                    break;
                case "7":
                    productService.loadProductBase();
                    break;
                case "8":
                    productService.clearProductBase();
                    break;
                case "9":
                    isWork = false;
                    break;
                default:
                    System.out.println("Invalid input!\n");
            }
        }
        while (isWork);
    }
}
