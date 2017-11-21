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
        System.out.println();
    }

    @Override
    public void removeClient() {
        System.out.println("Текущий полный список клиентов магазина: \n");
        for (Client client: clients) {
            System.out.println(toString(client));
            System.out.println();
        }
        System.out.println("\n Укажите индекс элемента коллекции для удаления соответствующего клиента из базы: ");
        clients.remove(CmdLineGetInfo.cmdLineGetInt());
        System.out.println("Текущий полный список клиентов магазина после редактирования базы: \n");
        for (Client client: clients) {
            System.out.println(toString(client));
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void modifyClient() {
        System.out.println("Текущий полный список клиентов магазина:");
        for (Client client: clients) {
            System.out.println(toString(client));
            System.out.println();
        }
        System.out.println("Укажите индекс элемента коллекции для изменения данных соответствующего клиента из базы и после этого вводите новые данные: ");
        clients.set(CmdLineGetInfo.cmdLineGetInt(), new Client());
        System.out.println("Текущий полный список клиентов магазина после редактирования базы: \n");
        for (Client client: clients) {
            System.out.println(toString(client));
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void findClient() {
        System.out.println("Введите имя искомого клиента: \n");
        String name = CmdLineGetInfo.cmdLineGetString();
        System.out.println("Введите фамилию искомого клиента \n");
        String surname = CmdLineGetInfo.cmdLineGetString();
        for (Client client: clients) {
            if(name.equals(client.getClientName())||surname.equals(client.getClientSurname())){
                System.out.println("Найдено совпадение: \n" + toString(client));
            }else System.out.println("Совпадений не найдено!");
        }
        System.out.println();
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
