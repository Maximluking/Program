
import services.CmdLineService;
import services.impl.ClientServiceDb;
import services.impl.ProductServiceImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CmdLineService cmdLineService = new CmdLineService(new ClientServiceDb(), new ProductServiceImpl());
        cmdLineService.mainMenu();
    }
}