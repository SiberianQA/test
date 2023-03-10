package com.test.FizzBuzz;

import java.util.ArrayList;

public class sum {
    public static void main(String[] args) {
        ArrayList<Integer> forSum = new ArrayList<>();
        forSum.add(5);
        forSum.add(4);
        forSum.add(4);
        forSum.add(4);

        int sum = 0;
        for(int i = 0;i < forSum.size();i++) {
            sum = sum + forSum.get(i);
        }
        System.out.println(sum);
    }
    }

