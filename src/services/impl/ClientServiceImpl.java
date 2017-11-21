package services.impl;

import model.Client;
import services.ClientService;
import services.CmdLineGetInfo;

import java.util.ArrayList;
import java.util.List;



public class  ClientServiceImpl implements ClientService {

    private List<Client> clients = new ArrayList<>();

    @Override
    public void addClient() {
        clients.add(new Client());
    }

    @Override
    public void removeClient() {
        System.out.println("Полный список клиентов магазина:");
        for (Client client: clients) {
            System.out.println(toString(client));
            System.out.println();
        }
        System.out.println("\n Укажите индекс элемента коллекции для удаления соответствующего клиента из базы: ");
        clients.remove(CmdLineGetInfo.cmdLineGetInt());
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
                + "Возраст клиента: " + client.getClientAge() + " лет" + "\n"
                + "Доступные наличные: " + client.getClientMoney() + " $" + "\n"
                + "Телефон для связи: " + client.getClientMobPhone();
    }
}
