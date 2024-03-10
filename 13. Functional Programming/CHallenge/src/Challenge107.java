import java.util.List;

public class Challenge107 {
    public static void main(String[] args) {
        List<String> list = List.of("Tanvir", "Hasan", "Emon");

        list.stream().forEach(name -> System.out.println(name));
    }
}
