package AutomationCourse;

import java.util.HashSet;
import java.util.Set;

public class Number15 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Lexus");
        names.add("Lada");
        names.add("Exceed");
        names.add("BMW");
        names.add("BMW");
        names.add("BMW");
        System.out.println(names);

        for (String name :names) {
            if(name.equals("Lada")){
                System.out.println("Найден нужный элемент");
                break;
            }
        }
    }
    //Set - неупорядоченный список, выводит только уникальные значения
}
