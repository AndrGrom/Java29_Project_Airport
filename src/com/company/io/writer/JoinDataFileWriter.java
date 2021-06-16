package com.company.io.writer;

import com.company.airport.JoinDataItem;
import com.company.util.JoinDataItemUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JoinDataFileWriter {

    private String filepath;

    public JoinDataFileWriter(String filepath) {
        this.filepath = filepath;
    }

    public void write(List<JoinDataItem> items) {
        try (FileWriter writer = new FileWriter(filepath)) {
            for (JoinDataItem item : items) {
                String str = JoinDataItemUtil.makeString(item);
                writer.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
