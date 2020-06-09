package com.IOtest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintStreamTest01 {

    public static void main(String[] args) {

        logger("调用了gc()方法");
    }

    public static void logger(String str){

        PrintStream printStream = null;

        FileOutputStream fis = null;

        try {

            printStream = new PrintStream("log.txt");


            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
            Date now = new Date();
            printStream.println(sdf.format(now) + "  " + str);
            System.out.println(sdf.format(now) + "  " + str);


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (printStream != null){
                printStream.close();
            }
        }

    }




}
