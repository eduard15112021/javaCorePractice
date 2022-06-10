package mane.week5.dz;

import java.io.*;

/*
В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе только полиндромы
*/


public class Task2 {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter(new File("answer.txt")/*,true */); //если это дописать то файл будет дополняться новым вводом а не перезаписываться

        BufferedReader reader = new BufferedReader(new FileReader("readme.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            if (isPalindrome(line))
                writer.write(line + "\n");
        }
        writer.close();
        reader.close();
    }

    public static Boolean isPalindrome(String st) {
        return st.equals(new StringBuffer(st).reverse().toString());
    }
}

