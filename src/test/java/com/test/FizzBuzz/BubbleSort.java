package com.test.FizzBuzz;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 1, 6, 8, 5, 2, 100, 11};

        int count;
        do {
            count = 0;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);

        for (int num : a) {
            System.out.print(num + ",");
        }
    }


}
