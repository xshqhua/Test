package study;

import java.util.Scanner;

/**
 * Created by qinghan on 2017/7/2.
 */
public class CommandBySwitch {
    public static void main(String[] args) {
        System.out.println("请选择功能：1、显示全部记录 2、查询登记记录 0、退出");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        switch (num) {
            case 1:
                System.out.println("显示全部记录");
                break;
            case 2:
                System.out.println("查询登记记录");
                break;
            case 0:
                System.out.println("欢迎使用！");
                break;
            default:
                System.out.println("输入错误！");

        }
    }
}
