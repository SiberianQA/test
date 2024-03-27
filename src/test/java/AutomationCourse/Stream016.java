package AutomationCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream016 {
    public static void main(String[] args) {
        List<CarWithEnum> cars = new ArrayList<CarWithEnum>() {{
            add(new CarWithEnum("BMW", TypeCar.CROSSOVER, "Black", 4));
            add(new CarWithEnum("Nissan Maxima", TypeCar.SEDAN, "Bronze", 4));
            add(new CarWithEnum("Lada 2108", TypeCar.HATCHBACK, "Red", 2));
            add(new CarWithEnum("Mersedes", TypeCar.CROSSOVER, "Green", 4));
            add(new CarWithEnum("Nissan Juke", TypeCar.PICKUP, "White", 2));
        }};


        List<CarWithEnum> streams = cars.stream().filter(y -> y.getType().equals(TypeCar.SEDAN)).collect(Collectors.toList());
        System.out.println(streams);

        List<String> only2doors = cars.stream()
                .filter(x->x.getDoorCount() > 2)
                .map(x->x.getCarName())
                .collect(Collectors.toList());
        System.out.println(only2doors);

        CarWithEnum lastCar = cars.get(cars.size()-1);

        CarWithEnum lastCarStream = cars.stream().reduce((y, x) -> x).get();
        System.out.println(lastCar.getCarName());
        System.out.println(lastCarStream.getCarName());

        Optional<CarWithEnum> lexus = cars.stream().filter(x->x.getCarName().equals("Lexus"))
                .findFirst();
        if (lexus.isPresent()) {
            System.out.println("lexus found, good");
        }
        else System.out.println("No Lexus found");

//можно эксепшн кинуть
//        cars.stream().filter(x->x.getCarName().equals("Lexus"))
//                .findFirst().orElseThrow(()-> new IllegalStateException("No Lexus found"));




//        List<CarWithEnum> sedans = new ArrayList<>();
//        for (int i = 0; i < cars.size(); i++) {
//            if (cars.get(i).getType().equals(TypeCar.SEDAN)){
//                sedans.add(cars.get(i));
//            }
//        }
//        System.out.println(sedans);
    }
}


