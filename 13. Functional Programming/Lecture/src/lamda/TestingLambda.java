package lamda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        test.printString("This is the best course");
        int sum = test.sum(5, 6);
    }

    public void printString(String toPrint) {
        System.out.println(toPrint);
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
