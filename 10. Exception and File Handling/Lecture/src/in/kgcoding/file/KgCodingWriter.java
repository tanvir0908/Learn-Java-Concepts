package in.kgcoding.file;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args) {
        // get file name
        String fileName = "java-course.txt";
        // create file writer object inside try block
        try (FileWriter writer = new FileWriter(fileName);) {
            // write file
            writer.write("This is the best Java course.\n");
            for (int i = 0; i < 10000; i++) {
                writer.write("* ");
            }
            // ensure all data is written out
            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException exception) {
            // input output exception handling
            System.out.printf("Exception occurred %s", exception.getMessage());
        }

    }
}
