package com.IOtest;

import java.io.*;

public class FileSteamTest2 {

    public static void main(String[] args) {

        //在当前目录下找a.txt ,没有则创建文件
        File f = new File("a.txt");

        try {
            FileOutputStream fop = new FileOutputStream(f) ;
            OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");

            writer.append("中文输入");//写入缓冲区
            writer.append("\r\n"); //换行
            writer.append("English");

            writer.close();
            fop.close();

            FileInputStream fip = new FileInputStream(f);
            InputStreamReader reader = new InputStreamReader(fip,"UTF-8");

            StringBuffer sb = new StringBuffer();
            while (reader.ready()){
                sb.append((char) reader.read()); //二进制转字符
            }

            System.out.println(sb.toString());

            reader.close();
            fip.close();

        }
          catch (IOException e) {
            e.printStackTrace();
        }
    }
}
