package services;

import model.Client;
import java.io.IOException;

public interface ClientService {

    void addClient() throws IOException;

    void showAllClients();

    void removeClient() throws IOException;

    void modifyClient() throws IOException;

    void findClient() throws IOException;

    void saveClientBase() throws IOException;

    void loadClientBase() throws IOException;

    void clearClientBase();
}
