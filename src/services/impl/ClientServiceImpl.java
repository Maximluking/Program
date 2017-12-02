package services.impl;

import model.Client;
import services.ClientService;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class  ClientServiceImpl implements ClientService {
    private BufferedReader reader;
    private List<Client> clients;
    private BufferedWriter bw;
    private BufferedReader br;

    public ClientServiceImpl() throws IOException {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.clients = new ArrayList<>();
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
        clients.add(new Client(id, name, surname, age));
    }

    @Override
    public void removeClient() throws IOException {
        if(clients.isEmpty()){
            System.out.println("Base empty!\n");
        }else {
            System.out.println("Enter ID to DELETE from BASE:\n");
            int id = readNumber();
            Boolean flag = true;
            for(Client client: clients){
                if(client.getClientId() == id){
                    clients.remove(client);
                    System.out.printf("Client deleted\n");
                    flag = false;
                }
            }
            if(flag) System.out.println("there is no client with this ID\n");
        }
    }

    @Override
    public void modifyClient() throws IOException {
        if(clients.isEmpty()){
            System.out.println("Base empty!\n");
        }else {
            System.out.println("Enter ID for change INFO:\n");
            int id = readNumber();
            Boolean flag = true;
            for(Client client: clients) {
                if (client.getClientId() == id) {
                    do {
                        System.out.println("Select the parameter to change:\n 1) Name.\n 2) Surname.\n 3) Age.\n 4) Exit.\n");
                        String s = reader.readLine();
                        switch (s) {
                            case "1":
                                System.out.println("Enter name:");
                                client.setClientName(reader.readLine());
                                break;
                            case "2":
                                System.out.println("Enter surname:");
                                client.setClientSurname(reader.readLine());
                                break;
                            case "3":
                                System.out.println("Enter age:");
                                client.setClientAge(Integer.parseInt(reader.readLine()));
                                break;
                            case "4":
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid input!\n");
                        }
                    } while (flag);
                }
            }
        if(flag) System.out.printf("Client with this ID = %s is not found\n", id);
        }
    }

    @Override
    public void findClient() throws IOException {
        if(clients.isEmpty()){
            System.out.println("Base empty!\n");
        }else{
            Boolean flag = true;
            Boolean containsParam = false;
            do{
                System.out.println("Select the parameter to search:\n 1) ID.\n 2) Name.\n 3) Surname.\n 4) Age.\n 5) Exit.\n");
                String s = reader.readLine();
                switch (s) {
                    case "1":
                        System.out.println("Enter ID:");
                        int id = readNumber();
                        for(Client client: clients) {
                            if (client.getClientId() == id) {
                                System.out.println("Coincidence:\n" + clientToString(client));
                                containsParam = true;
                            }
                        }
                        break;
                    case "2":
                        System.out.println("Enter name:");
                        String name = reader.readLine();
                        for(Client client: clients) {
                            if (name.equals(client.getClientName())) {
                                System.out.println("Coincidence:\n" + clientToString(client));
                                containsParam = true;
                            }
                        }
                        break;
                    case "3":
                        System.out.println("Enter surname:");
                        String surname = reader.readLine();
                        for (Client client: clients) {
                            if (surname.equals(client.getClientSurname())) {
                                System.out.println("Coincidence:\n" + clientToString(client));
                                containsParam = true;
                            }
                        }
                        break;
                    case "4":
                        System.out.println("Enter age:");
                        int age = readNumber();
                        for (Client client: clients) {
                            if (age == client.getClientAge()) {
                                System.out.println("Coincidence:\n" + clientToString(client));
                                containsParam = true;
                            }
                        }
                        break;
                    case "5":
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid input!\n");
                }
                if(!containsParam) {
                    System.out.println("Client not found!\n");
                    containsParam = true;
                }
            }while (flag);
        }
    }

    @Override
    public void showAllClients(){
        if(clients.isEmpty()) {
            System.out.println("Base empty!\n");
        }else {
            System.out.println("All clients:\n");
            for (Client client : clients) {
                System.out.println(clientToString(client));
            }
        }
    }

    @Override
    public void saveClientBase() throws IOException {
        if (clients.isEmpty()) {
            System.out.println("Base empty!");
            } else {
                File tempFile = new File("ClientBase.txt");
                bw = new BufferedWriter(new FileWriter(tempFile));
                for (Client client : clients) {
                    bw.write(baseConvertToFile(client));
                    }
                bw.close();
                System.out.printf("BASE is saved successfully to file: %s\n", tempFile.getAbsolutePath());
            }
    }


    @Override
    public void loadClientBase() throws IOException {
        File tempFile = new File("ClientBase.txt");
        br = new BufferedReader(new FileReader(tempFile));
        String line;
        while ((line = br.readLine())!=null){
            int id = Integer.parseInt(line);
            String name = br.readLine();
            String surname = br.readLine();
            int age = Integer.parseInt(br.readLine());
            clients.add(new Client(id, name, surname, age));
        }
        br.close();
        System.out.println("File is load successfully!\n");
    }

    @Override
    public void clearClientBase() {
        System.out.println("Base clear successfully!\n");
        clients.clear();
    }

    @Override
    public String clientToString(Client client){
        return "ID: " + client.getClientId() + "\n"
                + "Name: " + client.getClientName() + "\n"
                + "Surname: " + client.getClientSurname() + "\n"
                + "Age: " + client.getClientAge() + "\r\n";
    }

    @Override
    public String baseConvertToFile(Client client){
        return client.getClientId() + "\r\n"
                + client.getClientName()+ "\r\n"
                + client.getClientSurname() + "\r\n"
                + client.getClientAge() + "\r\n";
    }

    @Override
    public int readNumber() throws IOException {
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
