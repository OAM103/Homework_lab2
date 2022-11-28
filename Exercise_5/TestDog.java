package com.metanit.Exercise_5;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {
    private static ArrayList<String> D = new ArrayList<>();

    public static ArrayList<String> Dog_Name_Year(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        String N = sc.next();
        System.out.print("Год: ");
        int Y = sc.nextInt();
        D.add(N);
        D.add(Integer.toString(Y));
        Dog k = new Dog(N, Y);
        System.out.println(k.toString());
        return D;
    }


    public  static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - добавить собаку, 2 - выход");
            int i = sc.nextInt();
            if (i == 1) {
                System.out.println(Dog_Name_Year());
            }
            if (i == 2) {
                break;
            }
        }
    }
}
