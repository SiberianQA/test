package com.test.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class distinctAr {
    public static void main(String[] args) {
        String str = "ппрриветт";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String currentChar = String.valueOf(str.charAt(i));
            if (sb.indexOf(currentChar) == -1) {
                sb.append(currentChar);
            }
        }
        System.out.println(sb);
    }
}