package services;

import model.Client;

import java.io.IOException;

public interface ClientService {

    void addClient() throws IOException;

    void removeClient();

    void modifyClient();

    void findClient();

    String toString(Client client);
}
