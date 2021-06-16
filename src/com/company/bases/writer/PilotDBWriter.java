package com.company.bases.writer;

import com.company.airport.Pilot;
import com.company.bases.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotDBWriter {

    public static final String INSERT = "INSERT INTO pilot (id, first_name, last_name, rang, cod_pilot) VALUES(?,?,?,?,?)";

    public static void insert(List<Pilot> pilots) {
        for (Pilot pilot : pilots) {
            insert(pilot);
            pilot.toString();
        }
    }

    public static void insert(Pilot pilot) {
        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, pilot.getId());
            statement.setString(2, pilot.getFirst_name());
            statement.setString(3, pilot.getLast_name());
            statement.setString(4, pilot.getRank().name());
            statement.setString(5, pilot.getCod_pilot());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
