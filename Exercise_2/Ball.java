
public class Ball {
    double x = 0.0;
    double y = 0.0;

    public  Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX()
    { return x;}
    public void setX(double x)
    { this.x = x; }

    public double getY()
    { return y; }
    public void setY(double y)
    { this.y = y; }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        while (xDisp < 300) {
            System.out.println(xDisp + " " + yDisp);
            xDisp += x + (Math.random()*10);
            yDisp += y + (Math.random()*10);
        }
    }

    @Override
    public String toString(){
        return "Ball{" + "x = " + x + ", y = " + y + "}";
    }

}
