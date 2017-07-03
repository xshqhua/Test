package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by qinghan on 2017/6/13.
 */
public class PrintCalendar {//操作打印任意一年日历的类
    public static void main(String[] args)throws IOException{
        System.out.print("请输入一个年份：");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String str=br.readLine();
        year=Integer.parseInt(str);
        weekDay=firstDay(year);
        System.out.println("\n              "+year+"年            ");
        printMonth();
    }
    static  int year,monthDay,weekDay;//定义静态变量，以便其他类调用

    //判断是否是闰年
    public static boolean  isLeapYear(int year){
        return ((year%4==0 && year%100!=0)||(year%400==0));
    }
    //计算该年第一天星期几
    public static int firstDay(int year){
        long n=year*365;
        for (int i = 1; i <year ; i++) {
            if(isLeapYear(year)){
                n+=1;
            }
        }
        return (int)n%7;
    }
    //打印表头
    public static void printWeek(){
        System.out.println("================================");
        System.out.println("日   一   二   三   四   五   六");
    }
    public static int getMonthDay(int monthDay){
        switch (monthDay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }else {
                    return 28;
                }
                default:
                    return 0;
        }
    }
    //分别按照不同的条件逐月打印
    public static void printMonth(){
        for (int m = 1; m < 12; m++) {
            System.out.println(m+"月");
            printWeek();
            //按每月第一天是星期几打印相应的空格
            for (int j = 1; j <= weekDay ; j++) {
                System.out.print("     ");
            }
            //获取每月的天数
            int monthDay=getMonthDay(m);
            for (int d = 1; d <monthDay ; d++) {
                //对输出格式化
                if(d<10){
                    System.out.print(d+"    ");
                }else {
                    System.out.print(d+"   ");
                }
                weekDay=(weekDay+1)%7;//每打印一天后，算出第二天星期几
                if(weekDay==0){
                    System.out.println();//第二天星期tian,则换行
                }

            }
            System.out.println("\n");
        }
    }
}
