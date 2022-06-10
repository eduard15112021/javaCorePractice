package mane.week5.dz;
/*
Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл
Создаём класс TextFormater в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import static mane.week5.dz.TextFormater.isPalindromeInSent;
import static mane.week5.dz.TextFormater.numOfWords;

class TextFormater {
    public static int numOfWords(String str) {
        int count = 0;
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    public static Boolean isPalindromeInSent(String st) {
        boolean flag = false;
        String[] words = st.split(" ");
        for (String temp : words) {
            if (isPalindrome(temp))
                flag = true;
        }
        return flag;
    }

    public static Boolean isPalindrome(String st) {
        return st.equals(new StringBuffer().append(st).reverse().toString());
    }
}

public class Task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("readme.txt"));
        FileWriter writer = new FileWriter(new File("answer.txt")/*,true */);
        String st;
        int num = 0;
        while ((st = reader.readLine()) != null) {
            num = numOfWords(st);
            if (numOfWords(st) > 2 && numOfWords(st) < 6 || isPalindromeInSent(st)) {
                writer.write(st + "\n");
            }
        }
        writer.close();
        reader.close();
    }
}
