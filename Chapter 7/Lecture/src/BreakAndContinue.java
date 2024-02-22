public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Before loop");
        for (int i = 0; true; i++) {
            if (i == 101) {
                break;
            }
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nAfter loop");
    }
}
