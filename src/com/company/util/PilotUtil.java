package com.company.util;

import com.company.airport.Pilot;

import static com.company.io.IoConstants.DELIMITER;

public class PilotUtil {

    public static Pilot toObject(String line) {
        String[] pilotArr = line.split(DELIMITER);

        int id = Integer.parseInt(pilotArr[0]);
        String first_name = pilotArr[1];
        String last_name = pilotArr[2];
        Pilot.range rang = Pilot.range.valueOf(pilotArr[3]);
        String cod_pilot = pilotArr[4];

        return new Pilot(id, first_name, last_name, rang, cod_pilot);
    }

}
