

import com.metanit.Exercise_7.Bookshelf;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> Circles = new ArrayList<>();

        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();;
        System.out.print("R: ");
        int r = sc.nextInt();
        System.out.print("Color: ");
        String color = sc.next();

        Circle k = new Circle(x, y, r, color);
        Circles.add(k);
        System.out.println(Circles);
        System.out.println("Длина окружности = " + k.getLength() + "см");
    }
    
}
