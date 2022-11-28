
import java.util.Scanner;

public class CircleTest {
    public  static  void main(String[] args){
        Circle_1 k1 = new Circle_1(0, 0, 0, "red");
        Circle_1 k2 = new Circle_1(0, 0, 0, "blue");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус ");
        double r = sc.nextDouble();
        k1.setR(r);
        System.out.println("Длина окружности = " + k1.getLength() + "см");
        System.out.println("Площадь окружности = " + k1.getSquare() + "см");
        System.out.println("Введите радиус второй окружности ");
        r = sc.nextDouble();
        k2.setR(r);
        if(k1.compare(k1,k2)==-1){
            System.out.println("Радиус второй окружности больше, чем первой");
        }
        else if(k1.compare(k1,k2)==1) {
            System.out.println("Радиус первой окружности больше, чем второй" );
        }
        else{
            System.out.println("Радиусы окружностей равны");
        }

    }
}
