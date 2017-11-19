package services;

import java.util.Scanner;

public class CmdLineService {

    private Scanner command = new Scanner(System.in);

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
       if(command.hasNextInt()){
       return command.nextInt();} else
           {
               System.out.println("Введен недопустимый формат данных, повторите ввод:");
               command = new Scanner(System.in);
               return readCommand();
           }
    }
}
