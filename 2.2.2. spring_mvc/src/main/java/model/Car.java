package model;

public class Car {
    private int id;
    private String mark;
    private int year;

    public Car(int id, String mark, int year) {
        this.id = id;
        this.mark = mark;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }
}
