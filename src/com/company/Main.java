package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Class class1 = new Class(12, "Kyrgyzstan", new int[]{12, 34, 45, 56});

        System.out.println(class1.getbSan());
        System.out.println(class1.getWord());
        System.out.println(Arrays.toString(class1.getArray()));
    }
}
