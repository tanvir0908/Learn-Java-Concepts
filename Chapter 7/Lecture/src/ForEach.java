public class ForEach {
    public static void main(String[] args) {
        String[] names = {"Tanvir", "Hasan", "Emon", "Efat", "Partho", "Gopal", "Shimul"};

        System.out.println("Using for loop: ");
        printUsingFor(names);
        System.out.println("\nUsing for each loop");
        printUsingForEach(names);
    }

    public static void printUsingForEach(String[] names) {
        for (String name : names) {
            System.out.print(name+" ");
        }
    }

    public static void printUsingFor(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }
    }
}
