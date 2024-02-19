import java.util.Arrays;

class FindTwoDiagonalSum {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Elements Sum Calculator");

        // Take 2d array input from users
        int[][] numbers = ArrayUtility.input2DArray();
        // Display 2d array
        ArrayUtility.display2DArray(numbers);

        int[] leftDiagonalElements = findLeftDiagonalElements(numbers);
        int[] rightDiagonalElements = findRightDiagonalElements(numbers);
        int[] totalDiagonalNumbers = mergeTwoDiagonalNumbers(leftDiagonalElements, rightDiagonalElements);

        int diagonalSum = findDiagonalSum(totalDiagonalNumbers, numbers.length);
        System.out.println("Total diagonal numbers sum: " + diagonalSum);
    }

    public static int findDiagonalSum(int[] numbers, int row) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int[] mergeTwoDiagonalNumbers(int[] leftDiagonalNumbers, int[] rightDiagonalNumbers) {
        // remove duplicates
        int middlePoint = leftDiagonalNumbers.length/2;
        if(leftDiagonalNumbers[middlePoint] == rightDiagonalNumbers[middlePoint]){
            rightDiagonalNumbers[middlePoint] = 0;
        }

        // merge two diagonal numbers arrays
        int[] totalDiagonalNumbers = new int[leftDiagonalNumbers.length + rightDiagonalNumbers.length];
        int k = 0;
        for (int i = 0; i < leftDiagonalNumbers.length; i++) {
            totalDiagonalNumbers[k] = leftDiagonalNumbers[i];
            k++;
        }
        for (int i = 0; i < rightDiagonalNumbers.length; i++) {
            totalDiagonalNumbers[k] = rightDiagonalNumbers[i];
            k++;
        }
        return totalDiagonalNumbers;
    }

    public static int[] findLeftDiagonalElements(int[][] numbers) {
        int[] leftElements = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            leftElements[i] = numbers[i][i];
        }
        return leftElements;
    }

    public static int[] findRightDiagonalElements(int[][] numbers) {
        int[] rightElements = new int[numbers.length];
        int k = 0;
        // Merge two diagonal numbers
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i + j == numbers.length - 1) {
                    rightElements[k] = numbers[i][j];
                    k++;
                }
            }
        }
        return rightElements;
    }

}