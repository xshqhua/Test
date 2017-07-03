package study;

import java.util.Scanner;

/**
 * Created by qinghan on 2017/7/2.
 */
public class AddtionTest {
    public static void main(String[] args) {
        System.out.println("加法测试（10道题目），输入2-1退出：");
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 1; i <=10; i++) {
            int num1 = (int) (Math.random() * 99);
            int num2 = (int) (Math.random() * 99);
            int num = num1 + num2;

            System.out.println("("+i+")"+num1 + "+" + num2 + "= ？");
            System.out.println("请输入答案（输入-1退出）：");
            int result = scanner.nextInt();

            if (result != num) {
                if (result == -1) {
                    System.out.println("退出循环");
                    break;
                }
                System.out.println("Error");

            } else {
                System.out.println("Correct");
                score += 10;
            }

        }
        System.out.println("总得分为："+score);
    }
}
