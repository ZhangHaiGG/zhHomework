package day05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println();
    }
    public static void FileReaderFileWriter(String src, String out) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try{
            fileWriter = new FileWriter(out);
            fileReader = new FileReader(src);
            char[] chars = new char[1024];
            int num = 0;
            while ((num = fileReader.read(chars)) !=-1){
                fileWriter.write(chars,0,num);
                fileWriter.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                fileWriter.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
