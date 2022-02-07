package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Class class1 = new Class(18,"King", new int[] {12,15,7,88});

        System.out.println(class1.getNumber()+" "+class1.getWord()+" "+ Arrays.toString(class1.getArray()));


    }
}
