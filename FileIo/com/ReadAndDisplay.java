package FileIo.com;

import java.io.*;

public class ReadAndDisplay {
    public static void main(String[] args) throws IOException {
        File file=new File("source.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader br=new BufferedReader(fileReader);
        String line;
        while ((line= br.readLine())!=null){
            System.out.println(line);
        }
        fileReader.close();
    }
}
