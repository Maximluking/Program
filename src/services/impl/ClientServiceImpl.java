package services.impl;

import model.Client;
import services.ClientService;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class  ClientServiceImpl implements ClientService {

    private BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
    private Map<Integer, Client> clients = new HashMap<>();

    @Override
    public void addClient() throws IOException {
        System.out.println("Введите имя нового клиента:");
        String name = reader.readLine();
        System.out.println("Введите фамилию нового клиента:");
        String surname = reader.readLine();
        System.out.println("Сколько клиенту полных лет:");
        try {
            int age = Integer.parseInt(reader.readLine());
            Client client = new Client(name, surname, age);
            clients.put(client.hashCode(), client);
            System.out.println("Вы добавили в базу клиента:\n" + toString(client));
        }catch (NumberFormatException err){
            System.out.println("Вы ввели недопустимое значение!\n");
            addClient();
        }

    }

    @Override
    public void removeClient() throws IOException {
        System.out.println("Все клиенты базы:\n");
        for(Map.Entry<Integer, Client> client : clients.entrySet()){
            System.out.printf("Id клиента: %s\n" + "ИНФО. %s", client.getKey(), toString(client.getValue()));
            System.out.println();
        }
        if(clients.isEmpty()){
            System.out.println("Удалять нечего, база пуста!\n");
        }else {
            System.out.println("Введите id клиента на удаление из базы:\n");
            try {
                int id = Integer.parseInt(reader.readLine());
                if(clients.containsKey(id)){clients.remove(id);}
                else System.out.println("Клиента с таким id нет в базе!\n");
            }
            catch (NumberFormatException err){
                System.out.println("Вы ввели недопустимое значение!\n");
            }
        }
    }

    @Override
    public void modifyClient() throws IOException {
        System.out.println("Все клиенты базы:\n");
        for(Map.Entry<Integer, Client> client : clients.entrySet()){
            System.out.printf("Id клиента: %s\n" + "ИНФО. %s", client.getKey(), toString(client.getValue()));
            System.out.println();
        }
        if(clients.isEmpty()){
            System.out.println("Изменять нечего, база пуста!\n");
        }else {
            System.out.println("Введите id клиента для изменения ИНФО из базы:\n");
            try {
                int id = Integer.parseInt(reader.readLine());
                if (clients.containsKey(id)) {
                    Boolean flag = true;
                    do {
                        System.out.println("Выбирите параметр ИНФО для изменения:\n 1) Имя клиента.\n 2) Фамилия клиента.\n 3) Возраст клиента.\n 4) Выйти из меню изменений.\n");
                        String s = reader.readLine();
                        switch (s){
                            case "1":
                                System.out.println("Введите имя:");
                                clients.get(id).setClientName(reader.readLine());
                                break;
                            case "2":
                                System.out.println("Введите фамилию:");
                                clients.get(id).setClientSurname(reader.readLine());
                                break;
                            case "3":
                                System.out.println("Введите возраст:");
                                clients.get(id).setClientAge(Integer.parseInt(reader.readLine()));
                                break;
                            case "4":
                                flag = false;
                                break;
                            default:
                                System.out.println("Введен недопустимый параметр!\n");
                        }
                    }while (flag);
                } else System.out.println("Клиента с таким id нет в базе!\n");
            } catch (NumberFormatException err) {
                System.out.println("Вы ввели недопустимое значение!\n");
            }
        }
    }

    @Override
    public void findClient() throws IOException {
        if(clients.isEmpty()){
            System.out.println("База пуста, искать нечего!\n");
        }else{
            Boolean flag = true;
            Boolean containsParam = false;
            do{
                System.out.println("Выбирете параметр для поиска:\n 1) Имя клиента.\n 2) Фамилия клиента.\n 3) Возраст клиента.\n 4) Выйти из меню поиска.\n");
                String s = reader.readLine();
                switch (s) {
                    case "1":
                        System.out.println("Введите имя:");
                        String name = reader.readLine();
                        for (Map.Entry<Integer, Client> client : clients.entrySet()) {
                            if (name.equals(client.getValue().getClientName())) {
                                System.out.println("Совпадение найдено:\n" + toString(client.getValue()));
                                containsParam = true;
                            }
                        }
                        break;
                    case "2":
                        System.out.println("Введите фамилию:");
                        String surname = reader.readLine();
                        for (Map.Entry<Integer, Client> client : clients.entrySet()) {
                            if (surname.equals(client.getValue().getClientSurname())) {
                                System.out.println("Совпадение найдено:\n" + toString(client.getValue()));
                                containsParam = true;
                            }
                        }
                        break;
                    case "3":
                        System.out.println("Введите возраст:");
                        try {
                            int age = Integer.parseInt(reader.readLine());

                            for (Map.Entry<Integer, Client> client : clients.entrySet()) {
                                if (age == client.getValue().getClientAge()) {
                                    System.out.println("Совпадение найдено:\n" + toString(client.getValue()));
                                    containsParam = true;
                                }
                            }
                        }catch (NumberFormatException err){
                            System.out.println("Введен недопустимый параметр!\n");
                        }
                        break;
                    case "4":
                        flag = false;
                        break;
                    default:
                        System.out.println("Введен недопустимый параметр!\n");
                }
                if(!containsParam) {
                    System.out.println("По данному параметру клиент не найден!");
                    containsParam = true;
                }
            }while (flag);
        }
    }

    @Override
    public void saveClientBase() throws IOException {
        if(clients.isEmpty()){
            System.out.println("Сохранять нечего, база пуста!\n");
        }else{
            try {
                String pathTempFile = new File("").getAbsolutePath();
                File tempFile = new File(pathTempFile + "\\tempFile.txt");
                BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
                for (Map.Entry<Integer, Client> client : clients.entrySet()) {
                    bw.write(toString(client.getValue()) + "\n");
                }
                bw.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void loadClientBase() throws FileNotFoundException {


    }

    @Override
    public String toString(Client client){
        return "Имя: " + client.getClientName()+ "\n"
                + "Фамилия: " + client.getClientSurname() + "\n"
                + "ID клиента в базе магазина: " + client.hashCode() + "\n"
                + "Возраст клиента: " + client.getClientAge() + " лет\n";
    }
}
