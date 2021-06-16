package com.company.io.reader;

import com.company.airport.Cruise;
import com.company.exception.EmptySourceFile;
import com.company.util.CruiseUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CruiseDataFileReader {

    private String filepath;

    public CruiseDataFileReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Cruise> read() {
        List<Cruise> cruises = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            checkFile();

            String line;
            while ((line = reader.readLine()) != null) {
                Cruise cruise = CruiseUtil.toObject(line);
                cruises.add(cruise);
            }

        } catch (IOException | EmptySourceFile e) {
            e.printStackTrace();
        }
        return cruises;
    }

    private void checkFile() throws EmptySourceFile {
        File sourceFile = new File(filepath);

        if (sourceFile.length() ==0) {
            throw new EmptySourceFile("файл пуст");
        }
    }

}
