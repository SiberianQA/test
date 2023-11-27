package com.test.FizzBuzz;

import java.util.HashSet;
import java.util.Set;

public class hashCode {
    public static void main(String[] args) {
        hashObject m1 = new hashObject(1L, "name");
        hashObject m2 = new hashObject(1L, "name");

        if(m1.equels(m2)) {
            System.out.println("OK");
            System.out.println(m1.hashCode());
            System.out.println(m2.hashCode());
        }

        Set<hashObject> set = new HashSet<>();
        set.add(m1);
        set.add(m2);
        System.out.println(set.size());

    }


}
