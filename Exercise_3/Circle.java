

public class Circle extends Point{
    private double r;
    private String colour;

    public double getR()
    {return r;}
    public void setR(double r)
    {this.r = r;}

    public String getColour()
    {return colour;}
    public void setColour(String colour)
    {this.colour = colour;}

    public Circle(double x, double y, double r, String colour) {
        super(x,y);
        this.r = r;
        this.colour = colour;
    }

    public double getLength(){
        return 2*Math.PI*this.getR();
    }
}

