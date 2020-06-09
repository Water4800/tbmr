package com.IOtest;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileOutputSteamTest01 {

    public static void main(String[] args) throws IOException {


        FileOutputSteamTest01.logger("哈哈哈哈哈哈");
        FileOutputSteamTest01.logger("哈哈哈哈哈哈");
        FileOutputSteamTest01.logger("哈哈哈哈哈哈");
        FileOutputSteamTest01.logger("哈哈哈哈哈哈");


    }

    public static void logger(String str){

        FileOutputStream fop = null;
        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        Date now = new Date();
        PrintStream printStream = null;

        try {
            fop = new FileOutputStream("log.txt",true);
            printStream = new PrintStream(fop);
            // 格式化输出：
            printStream.println(sfd.format(now) + "  " + str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (printStream != null){
                printStream.close();
            }
        }
    }



}
