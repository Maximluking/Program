package services;


import model.Client;

public interface ClientService {

    void addClient();

    void removeClient();

    void modifyClient();

    void findClient();

    String toString(Client client);
}
