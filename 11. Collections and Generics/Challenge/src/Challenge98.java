import java.util.*;

public class Challenge98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bangladesh", "Dhaka");
        countryMap.put("India", "Delhi");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Canada", "Toronto");
        countryMap.put("Germany", "Berlin");

        System.out.println("Welcome to Capital finder");
        System.out.print("Please enter a country name: ");
        String countryName = input.next();

        if (countryMap.containsKey(countryName)) {
            System.out.printf("The capital of %s is %s", countryName, countryMap.get(countryName));
        } else {
            System.out.println("This country doesn't exist.");
        }
    }
}
