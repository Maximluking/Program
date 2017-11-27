package services.impl;

import model.Client;
import services.ClientService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class  ClientServiceImpl implements ClientService {

    private BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
    private List<Client> clients = new ArrayList<>();

    @Override
    public void addClient() throws IOException {
        System.out.println("Введите имя нового клиента:\n");
        String name = reader.readLine();
        System.out.println("Введите фамилию нового клиента:\n");
        String surname = reader.readLine();
        System.out.println("Сколько клиенту полных лет:\n");
        int age = Integer.parseInt(reader.readLine());
        int id = this.hashCode();
        clients.add(new Client(id, name, surname, age));
        System.out.println("Вы добавили нового клиента с полями:\n");

    }

    @Override
    public void removeClient() {

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
                + "Индекс элемента в коллекции: № " + clients.indexOf(client) + "\n"
                + "Возраст клиента: " + client.getClientAge() + " лет";
    }
}
