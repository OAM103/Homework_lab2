package com.metanit.Exercise_4;

import java.util.Scanner;
import java.util.Stack;

public class Shop {
    static  Stack S1 = new Stack<>();
    public  static void main(String[] args){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - добавить, 2 - удалить, 3 - поиск, 4 - выход");
            int i = sc.nextInt();
            if(i == 1){
                System.out.print("Имя: ");
                String N = sc.next();
                System.out.print("Модель: ");
                String M = sc.next();
                System.out.print("Год: ");
                String Y = sc.next();
                Computer k = new Computer(N, M, Y);
                S1.push(k.getS2());
            }
            if(i==2){
                try{
                    System.out.println(S1);
                    System.out.print("Номер элемента на удаление: ");
                    int a = sc.nextInt();
                    S1.remove(a+1);
                    System.out.println(S1);
                }catch (Exception ex){
                    System.out.println("Элемент не существует!");
                }

            }
            if(i==3){
                String str = sc.next();
                for(int j = 0; j<=S1.size(); j++){
                    try{
                        Stack D = (Stack) S1.get(j);
                        if( D.search(str)!=-1){
                            System.out.println(D);
                        }
                    }catch (Exception ex){
                    }

                }

            }
            if(i==4){
                break;
            }

        }
    }

}
class Computer extends Shop{

    String name;
    String model;
    String year;
    Stack S2 = new Stack<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }


    public Stack getS2() { return S2; }
    public void setS2(Stack S2) { this.S2 = S2; }

    public Computer(String name, String model, String year) {
        this.name = name;
        this.model = model;
        this.year = year;
        S2.push(name);
        S2.push(model);
        S2.push(year);

    }


}
