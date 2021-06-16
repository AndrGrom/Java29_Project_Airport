package com.company.util;

import com.company.airport.Plane;

import static com.company.io.IoConstants.DELIMITER;

public class PlanUtil {

    public static Plane toObject(String line) {
        String[] planeArr = line.split(DELIMITER);

        int id = Integer.parseInt(planeArr[0]);
        String brand = planeArr[1];
        String model = planeArr[2];
        int total_people = Integer.parseInt(planeArr[3]);
        int board_number = Integer.parseInt(planeArr[4]);

        return new Plane(id, brand, model, total_people, board_number);
    }

}
