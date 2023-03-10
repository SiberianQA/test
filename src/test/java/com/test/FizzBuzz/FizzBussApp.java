package com.test.FizzBuzz;


    /*
    Напишите программу, которая выводит на экран числа от 1 до 100.
    При этом вместо чисел, кратных 3, программа должны выводить слово "Fizz", а вместо чисел, кратных 5 - слово "Buzz".
    Если число кратно и 3, и 5, то программа должны выводить слово "FizzBuzz".
     */

public class FizzBussApp {

    public static void main(String args[]){
        for (int x = 1; x <= 100; x++){
            if ((x % 3 == 0) && (x % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if(x % 3 == 0){
                System.out.println("Fizz");
            } else if(x % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }
    }

}
