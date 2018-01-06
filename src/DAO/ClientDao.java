package DAO;

import model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {

    private Connection connection;

    public ClientDao() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:h2:tcp://localhost/~/TempDBClient", "", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addClient(Client client) {
        try (PreparedStatement ps =
                     connection.prepareStatement("insert into client (name, surname, age) values(? ,?, ?)");
        ) {
            ps.setString(1, client.getClientName());
            ps.setString(2, client.getClientSurname());
            ps.setInt(3, client.getClientAge());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Client> getAll() {
        try (PreparedStatement ps =
                     connection.prepareStatement("SELECT * FROM client");
        ) {

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
        try (PreparedStatement ps =
                     connection.prepareStatement("UPDATE client SET name = ?, surname = ?, age = ? WHERE id = ?")) {

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
