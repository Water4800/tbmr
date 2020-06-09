package com.IOtest;

import java.io.*;

public class FileSteamTest {

    public static void main(String[] args) {

        byte bWrite[] = {1,65,66,97} ;
        try {
            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0;x < bWrite.length;x++){
                os.write(bWrite[x]);  //  writes the bytes
            }
            //关闭输出流
            os.close();

            InputStream is = new FileInputStream("test.txt") ;
            int size = is.available();

            for(int i = 0 ; i < size ; i++){
                System.out.println( (char)is.read()  );// 把数字的ASCll转成对应的字符
            }
            //关闭输入流
            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
