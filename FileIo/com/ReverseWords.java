package FileIo.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseWords {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("source.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("reverse.txt");
        String line;
        int count=0;
        while ((line= bufferedReader.readLine())!=null){
            String words[]=line.split(" ");
            for(int i= words.length-1;i>=0;i--){
                fileWriter.write(words[i]+" ");
            }
            count+= words.length;
        }
        bufferedReader.close();
        fileWriter.close();
        System.out.println("Words reversed");
    }
}
