package com.metanit;

import java.util.*;

public class S {

    public static void main(String[] args){

        List<String> A = Arrays.asList("A", "B", "C");

        for (int i = 0; i < A.size()/2; i++){
            Collections.swap(A, i,A.size()-i-1);
        }

        System.out.println(A);
    }
}
