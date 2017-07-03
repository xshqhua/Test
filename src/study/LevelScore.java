package study;

import java.util.Scanner;

/**
 * Created by qinghan on 2017/7/2.
 */
public class LevelScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩（0-100）：");
        double score = scanner.nextDouble();
        if (score < 0 || score > 100) {
            System.out.println("输入成绩有误");
        } else if (90 < score && score < 100) {
            System.out.println("A");
        } else if (80 < score && score < 90) {
            System.out.println("B");
        } else if (70 < score && score < 80) {
            System.out.println("C");
        } else if (60 < score && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
