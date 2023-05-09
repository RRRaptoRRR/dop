import java.io.*;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;

public class Dop {
    //private FileReader reader;
    //private FileWriter writer;

    public Dop(){
        /*try {
            reader=new FileReader(way);
        }
        catch (IOException ex){
            System.out.println("No such file");
        }*/
    }
    public void Sort(String wayIn, String wayOut){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(wayIn));
            String str;
            ArrayList<String> words = new ArrayList<String>();
            int kol=0;
            while ((str=bufferedReader.readLine())!=null){
                words.add(str);
                kol+=str.length()+1;
            }
            bufferedReader.close();
            Collections.sort(words);
            CharBuffer charBuffer = CharBuffer.allocate(kol);
            for (String i: words){
                for (char j: i.toCharArray()){
                    charBuffer.put(j);
                }
                charBuffer.put(' ');
            }
            charBuffer.clear();
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(wayOut));
            char c;
            for (int i=0;i<kol; i++){
                c=charBuffer.get();
                if (c==' '){
                    bufferedWriter.newLine();
                }else bufferedWriter.write(c);

            }
            bufferedWriter.close();
        }
        catch (IOException ex){
            System.out.println("No such file");
        }
    }
    public void Symbol(String wayIn,  String symbol){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(wayIn));
            String str;
            ArrayList<String> words = new ArrayList<String>();
            while ((str=bufferedReader.readLine())!=null){
                if (str.contains(symbol)){
                    words.add(str);
                }
            }
            for (String i:words){
                System.out.println(i);
            }
        }
        catch (IOException ex){
            System.out.println("No such file");
        }

    }
}
