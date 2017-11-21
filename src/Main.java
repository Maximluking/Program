import services.ClientService;
import services.CmdLineService;
import services.ProductService;
import services.ShopService;
import services.impl.ClientServiceImpl;
import services.impl.ProductServiceImpl;
import services.impl.ShopServiceImpl;


public class Main {
    public static void main(String[] args){

        ClientService clientService = new ClientServiceImpl();
        ProductService productService = new ProductServiceImpl();
        ShopService shopService = new ShopServiceImpl();
        CmdLineService cmdLineService = new CmdLineService();

        boolean isWork = true;
        do {
            cmdLineService.showMainMenu();
            int s = cmdLineService.readCommand();
            switch (s){
                case 1:
                    cmdLineService.showClientMenu();
                    int s1 = cmdLineService.readCommand();
                    switch (s1){
                        case 1:
                            clientService.addClient();
                            System.out.println();
                            continue;
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
                            break;
                        default:
                            System.out.println("Неправильный ввод \n");
                    }
                    continue;
                case 2:
                    cmdLineService.showProductMenu();
                    int s2 = cmdLineService.readCommand();
                    switch (s2){
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
                            break;
                        default:
                            System.out.println("Неправильный ввод \n");
                    }
                    continue;
                case 3:
                    cmdLineService.showShopMenu();
                    int s3 = cmdLineService.readCommand();
                    switch (s3){
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
                            break;
                       default:
                            System.out.println("Неправильный ввод \n");
                    }
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