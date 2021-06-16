package com.company.bases.writer;

import com.company.airport.Plane;
import com.company.bases.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlaneDBWriter {

    public static final String INSERT = "INSERT INTO plane (id, brand, model, total_people, board_number) VALUES(?,?,?,?,?)";

    public static void insert(List<Plane> planes) {
        for (Plane plane : planes) {
            insert(plane);
        }
    }

    private static void insert(Plane plane) {
        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, plane.getId());
            statement.setString(2, plane.getBrand());
            statement.setString(3, plane.getModel());
            statement.setInt(4, plane.getTotal_people());
            statement.setInt(5, plane.getBoard_number());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
