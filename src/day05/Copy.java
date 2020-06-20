package day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("D:\\zhhomework\\src\\IN.txt");
            fos = new FileOutputStream("D:\\zhhomework\\OUT.txt");
            int bytes = 0;
            while((bytes = fis.read())!=-1){
                fos.write(bytes);
            }



        }catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException("复制失败");


        }finally {
            try{
                if(fos!=null)
                    fos.close();
            }catch(IOException e){
                throw new RuntimeException("写入目的关闭资源失败");
            }finally {
                try{
                    if(fis!=null)
                        fis.close();

                }catch(IOException e){
                    throw new RuntimeException("读取数据源关闭资源失败");
                }
            }

        }
    }
}
