import java.util.Scanner;

class Concatenate {
    public static void main(String[] args) {
        String firstName = "Tanvir";
        String lastName = "Hasan Emon";

//        String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}