package study;

import java.util.Scanner;

/**
 * Created by qinghan on 2017/7/2.
 */
public class LeapYear {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个年份，例如 2012");
        int year=scanner.nextInt();
        scanner.close();

        boolean isLeapYear=(year%4==0 && year%100!=0 ||year%400==0);
        String message=isLeapYear ? year+"是闰年" :year+"不是闰年";
        System.out.println(message);
    }
}
