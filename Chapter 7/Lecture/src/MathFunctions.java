public class MathFunctions {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-99));
//        System.out.println(Math.ceil(3.05));
//        System.out.println(Math.floor(3.9));
//        System.out.println(Math.round(3.4));
//        System.out.println(Math.round(3.5));

        for (int i = 0; i < 10; i++) {
            int random = (int) Math.round((Math.random() * 10));
            System.out.print(random + " ");
        }
        System.out.println("\n\n" + Math.PI);
    }
}
