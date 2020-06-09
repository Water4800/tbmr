package com.IOtest;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedWriterTest01 {


    public static void main(String[] args) {
        BufferedWriter bw = null;
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter("log.txt");
            bw = new BufferedWriter(printWriter);

//            bw.write("sssss");
//            bw.write("sssss");
//            bw.write("sssss");
//            bw.write("sssss");

            bw.append('a');

            bw.flush();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (printWriter != null){
                printWriter.close();
            }
        }
        ;


    }
}
