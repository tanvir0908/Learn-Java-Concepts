import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
        int[] myArr = {98, 65, 8, 2, 37};
        // array traversal
        int index = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }

//        String[] strArr = new String[3];
        String[] myStr = {"Tanvir", "Hasan", "Emon"};
        System.out.println(myStr.length);
    }
}
