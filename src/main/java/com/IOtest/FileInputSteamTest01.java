package com.IOtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
复制文件功能

 */
public class FileInputSteamTest01 {

    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\1\\files\\book.rar.rar");
            out = new FileOutputStream("D:\\1.rar");

            byte[] bytes = new byte[1024 * 2] ;
            int readCount = 0;
            while ( (readCount = in.read(bytes)) != -1){
                out.write(bytes,0,readCount);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
