package com.test.FizzBuzz;

public class reverseArray {

    public static void main(String[] args) {
        reverseArray();

    }

    static void reverseArray() {
        String str = "чебурашка";
        char [] array = str.toCharArray();
        String reverse = "";

        for (int i=array.length-1; i>=0;i--) {
            reverse = reverse + array[i];
        }

        System.out.println(reverse);

    }


}
