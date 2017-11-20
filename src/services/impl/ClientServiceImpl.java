package services.impl;

import model.Client;
import services.ClientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class  ClientServiceImpl implements ClientService {

    private List<Client> clients = new ArrayList<>();

    @Override
    public void addClient() {
        clients.add(new Client());
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
}
