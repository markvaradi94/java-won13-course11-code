package ro.fasttrackit.course11.code.files;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("files", "content.txt");
        readOneLine(file);
        System.out.println("======================================");
        readWholeFile();
        System.out.println("======================================");
        readWithBuffer();
    }

    private static void readWholeFile() throws IOException {
        Scanner scanner = new Scanner(Path.of("files/content.txt"));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    private static void readOneLine(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }

    private static void readWithBuffer() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\markv\\OneDrive\\Desktop\\New folder\\test.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
