package com.company.util;

import com.company.airport.Cruise;

import java.time.LocalDate;
import java.time.LocalTime;

import static com.company.io.IoConstants.DELIMITER;

public class CruiseUtil {

    public static Cruise toObject(String line) {
        String[] cruiseArr = line.split(DELIMITER);

        int id = Integer.parseInt(cruiseArr[0]);
        int plane_key = Integer.parseInt(cruiseArr[1]);
        int pilot_key = Integer.parseInt(cruiseArr[2]);
        LocalDate date_cruise = LocalDate.parse(cruiseArr[3]);
        LocalTime time_cruise = LocalTime.parse(cruiseArr[4]);
        int cruise_number = Integer.parseInt(cruiseArr[5]);

        return new Cruise(id, plane_key, pilot_key, date_cruise, time_cruise, cruise_number);
    }

}
