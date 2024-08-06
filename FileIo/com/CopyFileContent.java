package FileIo.com;

import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) throws IOException {
        File file=new File("source.txt");
        if(file.exists()) {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i=fileReader.read())!=-1){

                System.out.print((char)i);
            }
            fileReader.close();
        }else {
            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write("Hello world Hello!");
            fileWriter.write("\n hello hello");
            fileWriter.close();
        }
    }
}
