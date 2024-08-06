package FileIo.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInput {
    public static void main(String[] args) throws IOException {
        File file=new File("user_input.txt");
        FileWriter fileWriter=new FileWriter(file);
        Scanner scanner=new Scanner(System.in);
        fileWriter.write(scanner.nextLine());
        fileWriter.close();
    }
}
