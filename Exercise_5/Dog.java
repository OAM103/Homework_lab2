package com.metanit.Exercise_5;

public class Dog {
    String name;
    int year;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public Dog(String name, int year){
        this.name = name;
        this.year = year;
    }
    public int _Year(int year){
        return year*7;
    }
    public String toString(){
        return "Dog{" + "Name: " + name + ", Year: " + _Year(year) + "}";
    }
}
