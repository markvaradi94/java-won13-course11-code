package ro.fasttrackit.course11.code.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFiles {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"));

        writer.write("Test line 1");
        writer.newLine();
        writer.write("Test line 2");

        writer.close();
    }
}
