package com.company.util;

import com.company.airport.JoinDataItem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static com.company.io.IoConstants.DELIMITER;

public class JoinDataItemUtil {

    public static List<JoinDataItem> parseResultSet(ResultSet resultSet) throws SQLException {
        List<JoinDataItem> items = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String cruiseNumber = resultSet.getString("cruise_number");
            LocalDate cruiseDate = resultSet.getDate("date_cruise").toLocalDate();
            LocalTime cruiseTime = resultSet.getTime("time_cruise").toLocalTime();
            int boardNumber = resultSet.getInt("board_number");
            String brandWithModel = resultSet.getString("brand") + " " + resultSet.getString("model");
            int totalPeople = resultSet.getInt("total_people");
            String pilotFullName = resultSet.getString("last_name") + " " + String.valueOf((resultSet.getString("first_name").charAt(0) + "."));
            String codWithRank = resultSet.getString("cod_pilot") + " (" + resultSet.getString("rang") + ")";

            JoinDataItem item = new JoinDataItem(id, cruiseNumber, cruiseDate, cruiseTime, boardNumber, brandWithModel, totalPeople, pilotFullName, codWithRank);
            items.add(item);
        }
        return items;
    }

    public static String makeString(JoinDataItem item) {
        return item.getId() + DELIMITER
                + item.getCruiseNumber() + DELIMITER
                + item.getCruiseDate() + DELIMITER
                + item.getCruiseTime() + DELIMITER
                + item.getBoardNumber() + DELIMITER
                + item.getBrandWithModel() + DELIMITER
                + item.getTotalPeople() + DELIMITER
                + item.getPilotFullName() + DELIMITER
                + item.getCodWithRank() + "\n";
    }

}
