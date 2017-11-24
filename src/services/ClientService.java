package services;


import model.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface ClientService {

    BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

    default void serviceGetNewClient() throws IOException {
        int id = hashCode();
        System.out.println("Введите имя нового клиента:\n");
        String name = reader.readLine();
        System.out.println("Введите фамилию нового клиента:\n");
        String surname = reader.readLine();
        System.out.println("Сколько клиенту полных лет:\n");
        int age = Integer.parseInt(reader.readLine());
        addClient(new Client(id, name, surname, age));
    }

    void addClient(Client client);

    void removeClient();

    void modifyClient();

    void findClient();

    String toString(Client client);
}
