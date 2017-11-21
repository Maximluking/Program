package services;

import java.util.Scanner;

public class CmdLineGetInfo {

   private CmdLineGetInfo(){}

    public static String cmdLineGetString(){
       Scanner command = new Scanner(System.in);
       String com = command.nextLine();
       if(com.isEmpty()){
           System.out.println("Вы ничего не ввели, повторите ввод!");
           return cmdLineGetString();
       }else {
           return com;
       }
    }
    public static int cmdLineGetInt(){
        Scanner command = new Scanner(System.in);
        if(command.hasNextInt()){
            return command.nextInt();} else
        {
            System.out.println("Введен недопустимый формат данных, повторите ввод:");
            return cmdLineGetInt();
        }
    }
}
