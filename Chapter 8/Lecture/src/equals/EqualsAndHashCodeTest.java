package equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Tanvir", 24, "001");
        Person person2 = new Person("Tanvir", 24, "001");

        if (person1.equals(person2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        if (person1.hashCode() == person2.hashCode()) {
            System.out.println("Hashcode equals");
        } else {
            System.out.println("No match found");
        }
    }
}
