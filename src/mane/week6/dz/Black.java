package mane.week6.dz;

import java.io.BufferedReader;
import java.io.FileReader;



public class Black  {
    public static void main(String[] args) throws Exception{
        BufferedReader readerB = new BufferedReader(new FileReader("blackList.txt"));
        BufferedReader readerO = new BufferedReader(new FileReader("original.txt"));
        censorship(readerO,readerB);
        readerO.close();
        readerB.close();
    }

    public static void censorship(BufferedReader readerO, BufferedReader readerB) throws Exception{
        String  b = readerB.readLine();
        String [] black = b.split(" ");
        int counter=0;
        boolean flag=true;
        while ((b = readerO.readLine()) != null){
            counter++;
                for (String blackWord:black){
                    if (b.contains(blackWord)){
                        System.out.println("строчка номер: "+counter+": "+b);
                        flag = false;
                        break;
                    }
                }
        }
        if (flag){
            System.out.println("текст прошел цензуру");
        }
    }
}
