package AutomationCourse;

import java.util.HashMap;
import java.util.Map;

public class HashMap15 {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Oleg", 15);
        people.put("Dima", 25);
        people.put(null, 45);
        System.out.println(people.get("Oleg"));
        System.out.println(people);
        for (Map.Entry<String, Integer> stringIntegerEntry : people.entrySet()){
            if (stringIntegerEntry.getValue().equals(25)){
                System.out.println("найден боб");
                break;
            }
        }
    }
}
