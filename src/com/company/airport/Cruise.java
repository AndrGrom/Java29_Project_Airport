package com.company.airport;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cruise {
    private int id;
    private int plane_key;
    private int pilot_key;
    private LocalDate date_cruise;
    private LocalTime time_cruise;
    private int cruise_number;

    public Cruise(int id, int plane_key, int pilot_key, LocalDate date_cruise, LocalTime time_cruise, int cruise_number) {
        this.id = id;
        this.plane_key = plane_key;
        this.pilot_key = pilot_key;
        this.date_cruise = date_cruise;
        this.time_cruise = time_cruise;
        this.cruise_number = cruise_number;
    }

    public int getId() { return id; }
    public int getPlane_key() { return plane_key; }
    public int getPilot_key() { return pilot_key; }
    public LocalDate getDate_cruise() { return date_cruise; }
    public LocalTime getTime_cruise() { return time_cruise; }
    public int getCruise_number() { return cruise_number; }

    public void setId(int id) { this.id = id; }
    public void setPlane_key(int plane_key) { this.plane_key = plane_key; }
    public void setPilot_key(int pilot_key) { this.pilot_key = pilot_key; }
    public void setDate_cruise(LocalDate date_cruise) { this.date_cruise = date_cruise; }
    public void setTime_cruise(LocalTime time_cruise) { this.time_cruise = time_cruise; }
    public void setCruise_number(int cruise_number) { this.cruise_number = cruise_number; }

    @Override
    public String toString() {
        return "cruise{" +
                "id=" + id +
                ", plane_key=" + plane_key +
                ", pilot_key=" + pilot_key +
                ", date_cruise=" + date_cruise +
                ", time_cruise=" + time_cruise +
                ", cruise_number=" + cruise_number +
                '}'+ "\n";
    }
}
