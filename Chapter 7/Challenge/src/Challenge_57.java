import java.util.Scanner;

class MonthOfTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to month finder");
        System.out.print("Please enter the month number: ");
        int month = input.nextInt();
        String monthName = findMonthName(month);
        System.out.println("Your month name is: " + monthName);
    }

    public static String findMonthName(int month) {
        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        return monthName;
    }
}