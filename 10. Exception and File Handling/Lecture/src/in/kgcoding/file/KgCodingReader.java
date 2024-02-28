package in.kgcoding.file;

import java.io.FileReader;
import java.io.IOException;

/**
 * To read from file:
 * 1. Select file
 * 2. Create an object of Reader of that file inside try block
 * 3. Read until -1 occurred (-1 means end of file)
 * 4. Handle IOException
 */

public class KgCodingReader {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
//        String fileName = "C:/Users/tanvi/Desktop/file.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int readChar = 0;
            do {
                readChar = reader.read();
                if (readChar == -1) {
                    break;
                }
                System.out.print((char) readChar);
            } while (true);
        } catch (IOException exception) {
            System.out.printf("Exception occurred: %s", exception.getMessage());
        }
    }
}
