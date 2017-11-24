
import services.CmdLineService;

public class Main {
    public static void main(String[] args){
        CmdLineService cmdLineService = new CmdLineService(new ClientServiceImpl(), new ProductServiceImpl());
        cmdLineService.mainMenu();
    }
}