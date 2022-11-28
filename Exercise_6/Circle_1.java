package com.metanit.Exercise_6;


public class Circle_1 {
    private double x;
    private double y;
    private double r;
    private String colour;

    public double getX()
    {return x;}
    public void setX(double x)
    {this.x = x;}
    public double getY()
    {return y;}
    public void setY(double y)
    {this.y = y;}
    public Double getR()
    {return r;}
    public void setR(double r)
    {this.r = r;}
    public String getColour()
    {return colour;}
    public void setColour(String colour)
    {this.colour = colour;}

    public Circle_1(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    public double getSquare(){
        return Math.PI*this.getR()*this.getR();
    }
    public double getLength(){
        return 2*Math.PI*this.getR();
    }
    public boolean getEquals(Circle_1 Circle_1){//не Equals, а другое
        return this.r > Circle_1.r;
    }
    public int compare(Circle_1 o1, Circle_1 o2) {
        return o1.getR().compareTo(o2.getR());
    }
}
