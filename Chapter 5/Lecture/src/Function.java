public class Function {
    public static void main(String[] args) {
        System.out.println("First pattern: ");
        firstPattern();

//        System.out.println("Second pattern: ");
//        secondPattern();
//
//        System.out.println("Third pattern: ");
//        thirdPattern();
    }

    public static void firstPattern() {
//      print pattern using loops
        int rows = 0;
        while (rows <= 20) {
            int starCount = 0;
            while (starCount <= rows) {
                System.out.print("* ");
                starCount++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void secondPattern() {
        System.out.println("* * * * *");
        System.out.println("* * * * ");
        System.out.println("* * *   ");
        System.out.println("* *     ");
        System.out.println("*       \n");
    }

    public static void thirdPattern() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *\n");
    }
}
