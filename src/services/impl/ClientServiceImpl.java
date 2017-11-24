package services.impl;

import model.Client;
import services.ClientService;
import java.util.ArrayList;
import java.util.List;



public class  ClientServiceImpl implements ClientService {

    private List<Client> clients = new ArrayList<>();

    @Override
    public void addClient(Client client){
        clients.add(client);
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
                + "ID клиента в базе магазина: " + client.hashCode() + "\n"
                + "Индекс элемента в коллекции: № " + clients.indexOf(client) + "\n"
                + "Возраст клиента: " + client.getClientAge() + " лет";
    }
}
