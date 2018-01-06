package DAO;

import model.Client;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:tcp://localhost/~/ProgramDB";
    static final String USER = "";
    static final String PASS = "";

    private Connection connection;

    public ClientDao() {
        try {
            System.out.println("Connecting to database...");
            Class.forName (JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection to the database was successful");
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS clients (id INT(10) NOT NULL IDENTITY(1,1) PRIMARY KEY, name VARCHAR(20) NOT NULL, surname VARCHAR(20) NOT NULL, age INT(3) NOT NULL);");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addClient(Client client) {
        try (PreparedStatement ps = connection.prepareStatement("INSERT INTO clients (name, surname, age) values(? ,?, ?)")){
            ps.setString(1, client.getClientName());
            ps.setString(2, client.getClientSurname());
            ps.setInt(3, client.getClientAge());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Client> getAll() {
        try (PreparedStatement ps = connection.prepareStatement("SELECT * FROM clients")){
            ResultSet resultSet = ps.executeQuery();
            List<Client> clients = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                clients.add(new Client(id, name, surname, age));
            }
            return clients;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void updateClient(Client client) {
        try (PreparedStatement ps = connection.prepareStatement("UPDATE clients SET name = ?, surname = ?, age = ? WHERE id = ?")){
            ps.setString(1, client.getClientName());
            ps.setString(2, client.getClientSurname());
            ps.setInt(3, client.getClientAge());
            ps.setLong(4, client.getClientId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void removeClient(Client client){

    }

    public void findClient(Client client){

    }
}
