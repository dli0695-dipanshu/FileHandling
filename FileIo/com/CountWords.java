package FileIo.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("source.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String line;
        int count=0;
        while ((line= bufferedReader.readLine())!=null){
            String words[]=line.split(" ");
            count+= words.length;
        }
        bufferedReader.close();
        System.out.println(count);
    }
}
