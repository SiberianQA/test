package com.test.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class YandexPraktikum {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Картошка, мешки, 8");
        words.add("Яблоки, ящики, 11.5");
        words.add("Клубника, кг, 5.75");

        for (int i = 0; i < words.size(); i++) {
//            System.out.println("%-40s%10s%n" + words.get(i).replaceAll(",", ""));
            System.out.printf("%-10s", words.get(i).replaceAll(",", ""));
            System.out.println("\n");
        }

    }



}
