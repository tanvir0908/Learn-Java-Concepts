package filterandreduce;

import java.util.List;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Mango", "Orange", "Date");

        System.out.println("Printing fruit names normally:");
        for (String singleFruit : fruits) {
            System.out.print(singleFruit + " ");
        }

        System.out.println("\nPrinting fruit names streams:");
//        fruits.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String fruit) {
//                System.out.print(fruit + " ");
//            }
//        });

        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
