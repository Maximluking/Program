package DAO;

import model.Client;

import java.sql.*;

public class ClientDao {

    public void addClient(Client client) {
        try (Connection connection =
                     DriverManager.getConnection(
                             "jdbc:h2:~/MyDB3", "", "");
             Statement st = connection.createStatement();
             PreparedStatement ps = connection.prepareStatement("insert into client (name, surname, age) values(? ,?, ?)");
        ) {
            ps.setString(1, client.getClientName());
            ps.setString(2, client.getClientSurname());
            ps.setInt(3, client.getClientAge());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
