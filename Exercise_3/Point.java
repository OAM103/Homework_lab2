package com.metanit.Exercise_3;

public class Point {
    private double x;
    private double y;

    public double getX()
    { return x;}
    public void setX(double x)
    { this.x = x; }

    public double getY()
    { return y; }
    public void setY(double y)
    { this.y = y; }

    public  Point(double y, double x){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "Point{" + "x = " + x + ", y = " + y + "}";
    }

}
