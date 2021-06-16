package com.company.io.reader;

import com.company.airport.Pilot;
import com.company.exception.EmptySourceFile;
import com.company.util.PilotUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotDataFileReader {

    private String filepath;

    public PilotDataFileReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Pilot> read() {
        List<Pilot> pilots = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            checkFile();

            String line;
            while ((line = reader.readLine()) != null) {
                Pilot pilot = PilotUtil.toObject(line);
                pilots.add(pilot);
            }

        } catch (IOException | EmptySourceFile e) {
            e.printStackTrace();
        }
        return pilots;
    }

    private void checkFile() throws EmptySourceFile {
        File sourceFile = new File(filepath);

        if (sourceFile.length() == 0) {
            throw new EmptySourceFile("файл пуст");
        }
    }
}
