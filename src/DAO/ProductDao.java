package DAO;

import model.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private Connection connection;

    public ProductDao() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:h2:tcp://localhost/~/ProgramDB", "", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addProduct(Product product) {
        try (PreparedStatement ps =
                     connection.prepareStatement("insert into product (name, number, value, weight, volume) values(? ,?, ?, ?, ?)");
        ) {
            ps.setString(1, product.getProductName());
            ps.setInt(2, product.getProductNumber());
            ps.setInt(3, product.getProductValue());
            ps.setInt(4, product.getProductWeight());
            ps.setInt(5, product.getProductVolume());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Product> getAll() {
        try (PreparedStatement ps =
                     connection.prepareStatement("SELECT * FROM product");
        ) {

            ResultSet resultSet = ps.executeQuery();
            List<Product> products = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int number = resultSet.getInt("number");
                int value = resultSet.getInt("value");
                int weight = resultSet.getInt("weight");
                int volume = resultSet.getInt("volume");
                products.add(new Product(id, name, number, value, weight, volume));
            }
            return products;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void updateProduct(Product product) {
        try (PreparedStatement ps =
                     connection.prepareStatement("UPDATE product SET name = ?, number = ?, value = ?, weight = ?, volume = ? WHERE id = ?")) {

            ps.setString(1, product.getProductName());
            ps.setInt(2, product.getProductNumber());
            ps.setInt(3, product.getProductValue());
            ps.setInt(4, product.getProductWeight());
            ps.setInt(5, product.getProductVolume());
            ps.setLong(6, product.getProductId());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
