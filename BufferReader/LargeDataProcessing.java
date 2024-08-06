package BufferReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LargeDataProcessing {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("src/BufferReader/transactions.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        ArrayList<ArrayList<String>> arrayLists=new ArrayList<>();
        while ((line= bufferedReader.readLine())!=null){
            ArrayList<String> arr=new ArrayList<>(List.of(line.split(",")));
            arrayLists.add(arr);
        }
        bufferedReader.close();
        FileWriter fileWriter=new FileWriter("src/BufferReader/filtered_transactions.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (int i=0;i< arrayLists.size();i++){
            int z= Integer.parseInt(arrayLists.get(i).get(2));
            if(z>1200) {
                bufferedWriter.write(String.valueOf((arrayLists.get(i))));
            }
        }
        bufferedWriter.close();
    }
}
