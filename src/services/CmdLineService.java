package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdLineService {

    private String command = (new BufferedReader(new InputStreamReader(System.in))).readLine();

    public CmdLineService() throws IOException {
    }

    public void showMainMenu(){
        System.out.println("1. Работа с клиентами");
        System.out.println("2. Работа с продуктом");
        System.out.println("3. Работа с торговой точкой");
        System.out.println("4. Вернутся назад");
        System.out.println("5. Выход из программы");
    }

    public void showClientMenu(){
        System.out.println("1. Добавить нового клиента");
        System.out.println("2. Удалить клиента");
        System.out.println("3. Изменить данные клиента");
        System.out.println("4. Вернутся назад");
        System.out.println("5. Выход из программы");

    }

    public void showProductMenu(){
        System.out.println("1. Добавить новый продукт");
        System.out.println("2. Удалить продукт");
        System.out.println("3. Изменить данные продукта");
        System.out.println("4. Вернутся назад");
        System.out.println("5. Выход из программы");
    }

    public void showShopMenu(){
        System.out.println("1. Добавить новый магазин");
        System.out.println("2. Удалить магазин");
        System.out.println("3. Изменить данные магазина");
        System.out.println("4. Вернутся назад");
        System.out.println("5. Выход из программы");
    }

    public int readCommand(){
        return Integer.parseInt(command);
    }




}
