package com.test.FizzBuzz;

public class countWordsOfString {
    // Посчитать количество слок в строке

    static void fun1() {
        String str1 = "  Собеседование   на    JAVA   DEVELOPER    не такое уж    страшное!    ";
        String array[] = str1.trim().replaceAll("\\s{2,}", " ").split(" ");
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        System.out.println("Количество символов " + array.length);
    }

    public static void main(String[] args) {
        fun1();
    }

}
