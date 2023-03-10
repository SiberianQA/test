package com.test.FizzBuzz;

public class containsNumbers {
    public static void main(String[] args) {

        if (charContsinsOfNumber("привет")) {
            System.out.println("цифр нет");
        }
        else {
            System.out.println("цифры есть");
        }


    }
    static boolean charContsinsOfNumber(String enter) {
        char[] ar = enter.toCharArray();

        for (char s : ar){
            if(Character.isDigit(s)) {
                return false;
            }
        }
        return true;
    }
}
