package com.company.airport;

public class Plane {
    private int id;
    private String brand;
    private String model;
    private int total_people;
    private int board_number;

    public Plane(int id, String brand, String model, int total_people, int board_number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.total_people = total_people;
        this.board_number = board_number;
    }

    public int getId() { return id; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getTotal_people() { return total_people; }
    public int getBoard_number() { return board_number; }

    public void setId(int id) { this.id = id; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setTotal_people(int total_people) { this.total_people = total_people; }
    public void setBoard_number(int board_number) { this.board_number = board_number; }

    @Override
    public String toString() {
        return "plane{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", total_people=" + total_people +
                ", board_number=" + board_number +
                '}'+ "\n";
    }
}
