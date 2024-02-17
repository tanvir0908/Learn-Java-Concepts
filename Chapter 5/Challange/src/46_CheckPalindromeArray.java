class CheckPalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker");

        int[] numbers = ArrayUtility.userInputArray();

        boolean palindromeResult = palindromeChecker(numbers);
        if (palindromeResult) {
            System.out.println("✅ This is palindrome array");
        } else {
            System.out.println("⛔ This is not palindrome array");
        }
    }

    public static boolean palindromeChecker(int[] numbers) {
        int middlePoint = numbers.length / 2;
        int i = 0;
        int j = numbers.length - 1;
        for (i = 0; i < middlePoint; i++) {
            if (numbers[i] == numbers[j]) {
                j--;
            }
        }
        if (numbers.length % 2 == 0) {
            j++;
        }
        return i == j;
    }
}