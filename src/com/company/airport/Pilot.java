package com.company.airport;

public class Pilot {
    private int id;
    private String first_name;
    private String last_name;
    private range rang;
    private String cod_pilot;

    public enum range {
        first,
        second,
        captain
    }

    public Pilot(int id, String first_name, String last_name, range rang, String cod_pilot) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.rang = rang;
        this.cod_pilot = cod_pilot;
    }

    public int getId() { return id; }
    public String getFirst_name() { return first_name; }
    public String getLast_name() { return last_name; }
    public range getRank() { return rang; }
    public String getCod_pilot() { return cod_pilot; }

    public void setId(int id) { this.id = id; }
    public void setFirst_name(String first_name) { this.first_name = first_name; }
    public void setLast_name(String last_name) { this.last_name = last_name; }
    public void setRank(range rang) { this.rang = rang; }
    public void setCod_pilot(String cod_pilot) { this.cod_pilot = cod_pilot; }

    @Override
    public String toString() {
        return "pilot{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", rang=" + rang +
                ", cod_pilot='" + cod_pilot + '\'' +
                '}'+ "\n";
    }
}
