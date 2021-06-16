package com.company;

import com.company.airport.Cruise;
import com.company.airport.JoinDataItem;
import com.company.airport.Pilot;
import com.company.airport.Plane;
import com.company.bases.joiner.DataJoiner;
import com.company.bases.writer.CruiseDBWriter;
import com.company.bases.writer.PilotDBWriter;
import com.company.bases.writer.PlaneDBWriter;
import com.company.io.reader.CruiseDataFileReader;
import com.company.io.reader.PilotDataFileReader;
import com.company.io.reader.PlanDataFileReader;
import com.company.io.writer.JoinDataFileWriter;
import com.company.util.MessageOutputUtil;

import java.util.List;

import static com.company.io.IoConstants.*;

public class Main {

    public static void main(String[] args) {

// Read file
        PilotDataFileReader pilotDataFileReader = new PilotDataFileReader(PILOT_SOURCE_FILE);
        List<Pilot> pilots = pilotDataFileReader.read();
        PlanDataFileReader planDataFileReader = new PlanDataFileReader(PLANE_SOURCE_FILE);
        List<Plane> planes = planDataFileReader.read();
        CruiseDataFileReader cruiseDataFileReader = new CruiseDataFileReader(CRUISE_SOURCE_FILE);
        List<Cruise> cruises = cruiseDataFileReader.read();
// DataBase
        //      pilot
        MessageOutputUtil.startMess(Pilot.class.getSimpleName());
        System.out.println(pilots);
        PilotDBWriter.insert(pilots);
        MessageOutputUtil.finishMess(Pilot.class.getSimpleName());
        //      plane
        MessageOutputUtil.startMess(Plane.class.getSimpleName());
        System.out.println(planes);
        PlaneDBWriter.insert(planes);
        MessageOutputUtil.finishMess(Plane.class.getSimpleName());
        //      cruise
        MessageOutputUtil.startMess(Cruise.class.getSimpleName());
        System.out.println(cruises);
        CruiseDBWriter.insert(cruises);
        MessageOutputUtil.finishMess(Cruise.class.getSimpleName());

// JOIN
        List<JoinDataItem> items = DataJoiner.getJoinedData();
        System.out.println(items);
        JoinDataFileWriter dataFileWriter = new JoinDataFileWriter(RESULT_FILE);
        dataFileWriter.write(items);
    }
}
