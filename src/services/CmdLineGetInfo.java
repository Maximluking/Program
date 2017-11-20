package services;


import java.util.Scanner;

public class CmdLineGetInfo {

   private CmdLineGetInfo(){}

    public static String cmdLineGetString(){
       Scanner command = new Scanner(System.in);
       if(command.nextLine().isEmpty()){
           System.out.println("Вы ничего не ввели, повторите ввод!");
           return cmdLineGetString();
       }else {
           return command.nextLine();
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
    public static double cmdLineGetDouble(){
        Scanner command = new Scanner(System.in);
        if(command.hasNextDouble()){
            return command.nextDouble();} else
        {
            System.out.println("Введен недопустимый формат данных, повторите ввод:");
            return cmdLineGetDouble();
        }
    }
    public static long cmdLineGetLong(){
        Scanner command = new Scanner(System.in);
        if(command.hasNextLong()){
            return command.nextLong();} else
        {
            System.out.println("Введен недопустимый формат данных, повторите ввод:");
            return cmdLineGetLong();
        }
    }
}
