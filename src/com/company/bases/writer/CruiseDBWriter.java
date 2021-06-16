package com.company.bases.writer;

import com.company.airport.Cruise;
import com.company.bases.DbConnection;

import java.sql.*;
import java.util.List;

public class CruiseDBWriter {

    public static final String INSERT = "INSERT INTO cruise (id, plane_key, pilot_key, date_cruise, time_cruise, cruise_number) VALUES(?,?,?,?,?,?)";

    public static void insert(List<Cruise> cruises) {
        for (Cruise cruise : cruises) {
            insert(cruise);
        }
    }

    public static void insert(Cruise cruise) {
        Connection connection = DbConnection.getConnection();

        try(PreparedStatement statement = connection.prepareStatement(INSERT)){
            statement.setInt(1, cruise.getId());
            statement.setInt(2, cruise.getPlane_key());
            statement.setInt(3, cruise.getPilot_key());
            statement.setDate(4, Date.valueOf(cruise.getDate_cruise()));
            statement.setTime(5, Time.valueOf(cruise.getTime_cruise()));
            statement.setInt(6, cruise.getCruise_number());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
