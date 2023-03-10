package com.test.FizzBuzz;

import java.util.ArrayList;
import java.util.Comparator;

public class randomNumbers {
    public static void main(String[] args) {
//        double[] numbers = new double[10];
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i=0;i<10;i++) {
            numbers.add(Math.random()*100);
            System.out.println(numbers.get(i));
        }
        Double
                max = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(max);

    }
}
