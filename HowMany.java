package com.metanit;


public class HowMany {

    public static void main(String[] args) {
        int A = 0;
        for (String str : args){
            A++;
        }
        System.out.println(A);
    }
}
