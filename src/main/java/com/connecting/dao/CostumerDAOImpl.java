package com.connecting.dao;

import com.connecting.config.ConnectionFactory;
import com.connecting.model.Costumer;
import com.connecting.shared.dao.ClientNotSavedException;
import com.connecting.shared.dao.EmailAlreadyExistsException;
import com.connecting.shared.dao.ErrorRetrievingCostumerIDException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CostumerDAOImpl implements CostumerDAO{

    @Override
    public void save(Costumer costumer){
        String sql = "INSERT INTO clientes (nome, email) VALUES (?, ?)";

        try (Connection connection = ConnectionFactory.connection();
             PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1, costumer.getName());
            statement.setString(2, costumer.getEmail());

            statement.executeUpdate();

            System.out.println("Client successfully saved to PostgreSQL");

        }catch (SQLException e){
            if ("20505".equals(e.getSQLState())){
                throw new EmailAlreadyExistsException("Error: The e-mail: " + costumer.getEmail() + " is already registered. ", e);
            }
            throw new ClientNotSavedException("Error: Client not saved to the database: " + e.getMessage(), e);
        }
    }

    @Override
    public Costumer findById(int id){
        String sql = "SELECT id, nome, email FROM clientes WHERE id = ?";

        try (Connection connection = ConnectionFactory.connection();
        PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()){
                    String returnedName = resultSet.getString("nome");
                    String returnedEmail = resultSet.getString("email");
                    int returnedId = resultSet.getInt("id");

                    return new Costumer(returnedName, returnedEmail, returnedId);
                }
            }
        } catch (SQLException e) {
            throw new ErrorRetrievingCostumerIDException("Error: Retrieving customer ID" + e.getMessage(), e);
        }
        return null;
    }
}
