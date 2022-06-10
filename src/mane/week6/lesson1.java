package mane.week6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class lesson1 {
    public static void main(String[] args) {
        File file=new File("file.txt");
        try {
            FileWriter fileWriter =new FileWriter(file);
            fileWriter.write("fuf fun fec");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR");;
        }
        if (file.delete()){
            System.out.println("Deleted the file"+file.getName());
        }else {
            System.out.println("Failed to delete the file");
        }
    }
}
