package com.IOtest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

    public static void main(String[] args) {

        BufferedReader br = null;
        InputStreamReader reader = null;
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("a.txt");
            reader = new InputStreamReader(fis);
            br = new BufferedReader(reader);

            String s = null;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
