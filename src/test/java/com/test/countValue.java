package com.test;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countValue {
    public static void main(String[] args) {
        Map<Character, Integer> letters = new HashMap<Character, Integer>();

        ArrayList<Character> fakeArray = new ArrayList<Character>();
        fakeArray.add('a');
        fakeArray.add('a');
        fakeArray.add('a');
        fakeArray.add('b');
        fakeArray.add('b');
        fakeArray.add('c');
        fakeArray.add('c');
        fakeArray.add('c');
        fakeArray.add('w');
        fakeArray.add('w');
        fakeArray.add('w');
        fakeArray.add('w');
        fakeArray.add('g');

        for (int i = 0; i < fakeArray.size(); i++) {
            Character tempChar = fakeArray.get(i);

            if (!letters.containsKey(tempChar)) {
                letters.put(tempChar, 1);
            } else {
                letters.put(tempChar, letters.get(tempChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.println("Буква = " + entry.getKey() + ", Повторений = " + entry.getValue());
        }

    }

}
