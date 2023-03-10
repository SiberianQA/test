package com.test.FizzBuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findDuplicate {
    private static void findDuplicate(List<Integer> elements) {
//находим сумму всех уникальных элементов списка
        int distinctSum = elements.stream().distinct().mapToInt(e -> e).sum();
//находим сумму всех элементов списка
        int totalSum = elements.stream().mapToInt(e -> e).sum();
        System.out.println("Элемент, который повторяется : " + (totalSum - distinctSum));
    }

    public static void main(String[] args) {
//создаем список последовательных элементов на промежутке [1..101).
        List <Integer> elements = IntStream.range(1, 101).boxed().collect(Collectors.toList());
        System.out.println(elements.stream().mapToInt(b -> b).sum());
//устанавливаем элементу с индексом 53 значение 23
        elements.set(53, 23);
        findDuplicate(elements);
    }
}
