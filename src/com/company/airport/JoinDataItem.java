package com.company.airport;

import java.time.LocalDate;
import java.time.LocalTime;

public class JoinDataItem {

    private int id;
    private String cruiseNumber;
    private LocalDate cruiseDate;
    private LocalTime cruiseTime;
    private int boardNumber;
    private String brandWithModel;
    private int totalPeople;
    private String pilotFullName;
    private String codWithRank;

    public JoinDataItem(int id, String cruiseNumber, LocalDate cruiseDate, LocalTime cruiseTime, int boardNumber, String brandWithModel, int totalPeople, String pilotFullName, String codWithRank) {
        this.id = id;
        this.cruiseNumber = cruiseNumber;
        this.cruiseDate = cruiseDate;
        this.cruiseTime = cruiseTime;
        this.boardNumber = boardNumber;
        this.brandWithModel = brandWithModel;
        this.totalPeople = totalPeople;
        this.pilotFullName = pilotFullName;
        this.codWithRank = codWithRank;
    }

    public int getId() { return id; }
    public String getCruiseNumber() { return cruiseNumber; }
    public LocalDate getCruiseDate() { return cruiseDate; }
    public LocalTime getCruiseTime() { return cruiseTime; }
    public int getBoardNumber() { return boardNumber; }
    public String getBrandWithModel() { return brandWithModel; }
    public int getTotalPeople() { return totalPeople; }
    public String getPilotFullName() { return pilotFullName; }
    public String getCodWithRank() { return codWithRank; }

    public void setId(int id) { this.id = id; }
    public void setCruiseNumber(String cruiseNumber) { this.cruiseNumber = cruiseNumber; }
    public void setCruiseDate(LocalDate cruiseDate) { this.cruiseDate = cruiseDate; }
    public void setCruiseTime(LocalTime cruiseTime) { this.cruiseTime = cruiseTime; }
    public void setBoardNumber(int boardNumber) { this.boardNumber = boardNumber; }
    public void setBrandWithModel(String brandWithModel) { this.brandWithModel = brandWithModel; }
    public void setTotalPeople(int totalPeople) { this.totalPeople = totalPeople; }
    public void setPilotFullName(String pilotFullName) { this.pilotFullName = pilotFullName; }
    public void setCodWithRank(String codWithRank) { this.codWithRank = codWithRank; }

    @Override
    public String toString() {
        return "JoinDataItem{" +
                "id=" + id +
                ", cruiseNumber='" + cruiseNumber + '\'' +
                ", cruiseDate=" + cruiseDate +
                ", cruiseTime=" + cruiseTime +
                ", boardNumber=" + boardNumber +
                ", brandWithModel='" + brandWithModel + '\'' +
                ", totalPeople=" + totalPeople +
                ", pilotFullName='" + pilotFullName + '\'' +
                ", codWithRank='" + codWithRank + '\'' +
                '}'+ "\n";
    }
}
