package com.company.bases.joiner;

import com.company.airport.JoinDataItem;
import com.company.bases.DbConnection;
import com.company.util.JoinDataItemUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DataJoiner {

    public static final String QUERY = "SELECT cr.id, cr.cruise_number, cr.date_cruise, cr.time_cruise, pl.board_number," +
            " pl.brand, pl.model, pl.total_people, p.first_name, p.last_name, p.cod_pilot, p.rang " +
            "FROM cruise AS cr " +
            "INNER JOIN plane AS pl " +
            "ON cr.plane_key = pl.id " +
            "INNER JOIN pilot AS p " +
            "ON cr.pilot_key = p.id";

    public static List<JoinDataItem> getJoinedData() {
        List<JoinDataItem> result = null;

        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(QUERY)) {

            ResultSet resultSet = statement.executeQuery();
            result = JoinDataItemUtil.parseResultSet(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}