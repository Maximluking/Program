package services.impl;

import DAO.ClientDao;
import model.Client;
import services.ClientService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ClientServiceDb implements ClientService{
    private ClientDao clientDao;
    private BufferedReader reader;

    public ClientServiceDb() throws IOException {
        this.clientDao = new ClientDao();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void addClient() throws IOException {
        System.out.println("Enter ID:");
        int id = readNumber();
        System.out.println("Enter name:");
        String name = reader.readLine();
        System.out.println("Enter surname:");
        String surname = reader.readLine();
        System.out.println("Enter age:");
        int age = readNumber();
        clientDao.addClient(new Client(id, name, surname, age));
    }

    @Override
    public void removeClient() throws IOException {

    }

    @Override
    public void modifyClient() throws IOException {
        System.out.println("Enter ID:");
        int id = readNumber();
        System.out.println("Enter name:");
        String name = reader.readLine();
        System.out.println("Enter surname:");
        String surname = reader.readLine();
        System.out.println("Enter age:");
        int age = readNumber();
        clientDao.updateClient(new Client(id, name, surname, age));
    }

    @Override
    public void findClient() throws IOException {

    }

    @Override
    public List<Client> showAllClients(){
        return clientDao.getAll();
    }

    private int readNumber() throws IOException {
        int id;
        while (true) {
            try {
                id = Integer.valueOf(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter the number!");
            }
        }
        return id;
    }
}