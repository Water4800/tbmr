package com.tbmr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestDay {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
//        int month = scanner.nextInt();
//        int day = scanner.nextInt();

        Date date = new Date();

        /**
         * yyyy 年份 MM 月份 dd 天
         *
         *
         * hh 小时
         * mm 分钟
         * ss 秒
         */

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前日期：" + simpleDateFormat.format(date));

    }

    public static long getGapDays(String date1, String date2) {
         String[] d1 = date1.split("-");
         String[] d2 = date2.split("-");
         Calendar c = Calendar.getInstance();

        c.set(Integer.parseInt(d1[0]), Integer.parseInt(d1[1]), Integer.parseInt(d1[2]), 0, 0, 0);
        long l1 = c.getTimeInMillis();
        c.set(Integer.parseInt(d2[0]), Integer.parseInt(d2[1]), Integer.parseInt(d2[2]), 0, 0, 0);
        long l2 = c.getTimeInMillis();

         return (Math.abs(l1 - l2) / (24 * 60 * 60 * 1000));
    }


}
