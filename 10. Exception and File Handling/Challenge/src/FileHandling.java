import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Challenge 88:
 * 1. Read a file and display its content
 * 2. handle situation if the file doesn't exist
 * 3. take that file name from user
 */

public class FileHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        String fileName = input.nextLine();

        // try with resource
        try (FileReader reader = new FileReader(fileName)) {
            int readChar;
            while (true) {
                readChar = reader.read();
                if (readChar == -1) {
                    break;
                }
                System.out.print((char) readChar);
            }
        } catch (FileNotFoundException exception) {
            System.out.printf("%s not found. Please enter a valid name.", fileName);
        } catch (IOException exception) {
            System.out.printf("Exception occurred: %s", exception.getMessage());
        }
    }
}
