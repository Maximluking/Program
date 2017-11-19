import services.ClientService;
import services.CmdLineService;
import services.impl.ClientServiceImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ClientService clientService = new ClientServiceImpl();
        CmdLineService cmdLineService = new CmdLineService();

        boolean isWork = true;
        do {
            cmdLineService.showMainMenu();
            int s = cmdLineService.readCommand();
            switch (s) {
                case 1:
                    clientService.addClient();
                    break;
                case 2:
                    clientService.removeClient();
                    break;
                case 4:
                    isWork = false;
                    break;
                default:
                    System.out.println("Неправильный ввод \n");
                    break;
            }
        }
        while (isWork);
    }
}