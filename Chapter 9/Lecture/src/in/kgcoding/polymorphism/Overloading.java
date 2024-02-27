package in.kgcoding.polymorphism;

public class Overloading {

    Overloading() {
        System.out.println("Default constructor");
    }

    Overloading(String pop) {
        System.out.println(pop);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String add(String str1, String str2) {
        return str1 + str2;
    }

    public static int add(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.add(2, 3));
        System.out.println(overloading.add("2", "3"));
        System.out.println(overloading.add(2, 3, 4, 5));
    }
}
