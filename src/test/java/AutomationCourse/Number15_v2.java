package AutomationCourse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number15_v2 {
    public static void main(String[] args) {
        List<String> namesOriginal = new ArrayList<String>() {
            {
                add("Lexus");
                add("Lexus");
                add("Lada");
                add("Nissan");
                add("Nissan");
            }};

        Set<String> names = new HashSet<>(namesOriginal);
        System.out.println(names);
    }
}