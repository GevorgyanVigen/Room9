package room;

public class Student {
    private String name;
    private String surname;
    private int year = 2001;
    private double mark;
    private char gender;
    private boolean armenian;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isArmenian() {
        return armenian;
    }

    public void setArmenian(boolean armenian) {
        this.armenian = armenian;
    }
}
