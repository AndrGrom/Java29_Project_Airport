package com.company.io.reader;

import com.company.airport.Plane;
import com.company.exception.EmptySourceFile;
import com.company.util.PlanUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlanDataFileReader {

    private String filepath;

    public PlanDataFileReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Plane> read() {
        List<Plane> planes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            checkFile();

            String line;
            while ((line = reader.readLine()) != null) {
                Plane plane = PlanUtil.toObject(line);
                planes.add(plane);
            }
        } catch (IOException | EmptySourceFile e) {
            e.printStackTrace();
        }
        return planes;
    }

    private void checkFile() throws EmptySourceFile {
        File sourceFile = new File(filepath);

        if (sourceFile.length() == 0) {
            throw new EmptySourceFile("файл пуст");
        }
    }

}