package com.IOtest;

import java.io.*;

public class CopyTest01 {

    public static void main(String[] args) {

        File srcFile = new File("D:\\工作");
        File toFile = new File("D:\\TestCopy\\");

        copy(srcFile,toFile);
    }


    public static void copy(File from,File to){

        //退化处理
        if ( from == null){
            return;
        }

        if (from.isFile()){

            //输出指定目录
            String toPath = new String(to.getAbsolutePath().endsWith("\\") ? to.getAbsolutePath() : to.getAbsolutePath() + "\\"
                    + from.getAbsolutePath().substring(3) );
            //输入流
            FileInputStream in = null;
            FileOutputStream out = null;

            try {
                in = new FileInputStream(from);
                byte[] bytes = new byte[1024];
                out = new FileOutputStream(toPath);
                int readCount = 0;
                while((readCount = in.read(bytes)) != -1){
                    out.write(bytes,0,readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (out != null){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (in != null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            return;
        }

        File[] files = from.listFiles();
        for(File file : files){
            if (file.isDirectory()){
                //目标文件目录，取目标目录路径 + 源目录路径
                String toPath = new String(to.getAbsolutePath().endsWith("\\") ? to.getAbsolutePath() : to.getAbsolutePath() + "\\"
                                                + file.getAbsolutePath().substring(3));
                File newFile = new File(toPath);
                //当前目录不存在
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            //递归目录，直至不会是文件路径
            copy(file,to);
        }
    }
}
