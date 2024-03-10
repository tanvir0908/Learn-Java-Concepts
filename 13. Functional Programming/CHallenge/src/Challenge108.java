import java.util.List;

public class Challenge108 {
    public static void main(String[] args) {
        List<String> list = List.of("Prashant Jain", "is teaching java", "good", "bad", "on KG Coding", "Best course on Youtube");
        String newList =list.stream().filter(item -> item.length() > 10).reduce("", (a, b) -> a + " " + b);
        System.out.println(newList);
    }
}
