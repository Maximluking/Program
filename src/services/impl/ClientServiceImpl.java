package services.impl;

import model.Client;
import services.ClientService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        int age = Integer.parseInt(reader.readLine());
        Client client = new Client(name, surname, age);
        clients.put(client.hashCode(), client);
        System.out.println("Вы добавили в базу клиента:\n" + toString(client) + "\n");
    }

    @Override
    public void removeClient() throws IOException {
        System.out.println("Все клиенты базы:\n");
        for(Map.Entry<Integer, Client> client : clients.entrySet()){
            System.out.printf("Id клиента: %s\n" + "ИНФО. %s\n", client.getKey(), toString(client.getValue()));
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
                System.out.println("Вы ввели недопустимые значения!\n");
            }
        }
    }

    @Override
    public void modifyClient() throws IOException {
        System.out.println("Все клиенты базы:\n");
        for(Map.Entry<Integer, Client> client : clients.entrySet()){
            System.out.printf("Id клиента: %s\n" + "ИНФО. %s\n", client.getKey(), toString(client.getValue()));
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
                                clients.get(id).setClientName(reader.readLine());
                                break;
                            case "2":
                                clients.get(id).setClientSurname(reader.readLine());
                                break;
                            case "3":
                                clients.get(id).setClientAge(Integer.parseInt(reader.readLine()));
                                break;
                            case "4":
                                flag = false;
                                break;
                            default:
                                System.out.println("Введен недопустимый параметр!\n");
                        }
                        clients.put(id, clients.get(id));
                    }while (flag);
                } else System.out.println("Клиента с таким id нет в базе!\n");
            } catch (NumberFormatException err) {
                System.out.println("Вы ввели недопустимые значения!\n");
            }
        }
    }

    @Override
    public void findClient() {
    }

    @Override
    public String toString(Client client){
        return "Имя: " + client.getClientName()+ "\n"
                + "Фамилия: " + client.getClientSurname() + "\n"
                + "ID клиента в базе магазина: " + client.hashCode() + "\n"
                + "Возраст клиента: " + client.getClientAge() + " лет";
    }
}
