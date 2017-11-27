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
        int id = age*20;
        clients.put(age, new Client(id, name, surname, age));
        System.out.println("Вы добавили в базу клиента:");


    }

    @Override
    public void removeClient() throws IOException {
        System.out.println("Все клиенты базы:");
        for(Map.Entry<Integer, Client> client : clients.entrySet()){
            System.out.printf("Ключ: %s  Клиент: %s \n", client.getKey(), toString(client.getValue()));
        }
        if(clients.isEmpty()){
            System.out.println("Удалять нечего, база пуста");
        }else {
            System.out.println("Введите id клиента на удаление из базы:");
            int id = Integer.parseInt(reader.readLine());
            if(clients.containsKey(id)){clients.remove(id);}
            else System.out.println("Клиента с таким id ет в базе!");
        }
    }

    @Override
    public void modifyClient() {

    }

    @Override
    public void findClient() {
    }

    @Override
    public String toString(Client client){
        return "Имя: " + client.getClientName()+ "\n"
                + "Фамилия: " + client.getClientSurname() + "\n"
                + "ID клиента в базе магазина: " + client.getClientId() + "\n"
                + "Возраст клиента: " + client.getClientAge() + " лет";
    }
}
