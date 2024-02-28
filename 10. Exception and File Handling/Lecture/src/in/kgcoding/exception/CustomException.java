package in.kgcoding.exception;

public class CustomException extends Exception {
    private double degree;

    public CustomException(double degree) {
        this.degree = degree;
    }

    public String getMessage() {
        return "The temperature is not in normal range";
    }

    public double getDegree() {
        return degree;
    }

    public static void main(String[] args) {
        CustomException c1 = new CustomException((10));
        System.out.println(c1.getMessage());
    }
}
