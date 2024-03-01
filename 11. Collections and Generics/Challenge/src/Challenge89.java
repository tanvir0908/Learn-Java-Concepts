public class Challenge89 {
    public static void main(String[] args) {
        System.out.println(concatenate("Tanvir", "Hasan", "Emon"));
        System.out.println(concatenate("Prashant", "Jain", "Sir"));
        System.out.println(concatenate("This", "is", "the", "best", "Java", "tutorial"));
    }

//     type 1 using + operator
//    public static String concatenate(String... elements) {
//        String newString = "";
//        for (String element : elements) {
//            newString += element;
//        }
//        return newString;
//    }


    // type 2 using string builder
    public static String concatenate(String... elements) {
        StringBuilder newString = new StringBuilder();
        for (String element : elements) {
            newString.append(element).append(" ");
        }
        return newString.toString();
    }
}
