package com.test.FizzBuzz;

import java.util.stream.IntStream;

public class countNumbers {
    public static void main(String[] args) {
//            for(int i=1;i<=10;i++){
//                int x = i *10;
//                System.out.printf("(%s * 10 = %s)%n", i, x);
//        }
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.printf("%d * 10 = %d%n", i, i * 10));
    }

}
