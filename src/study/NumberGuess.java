package study;

import java.util.Scanner;

/**
 * Created by qinghan on 2017/7/2.
 */
public class NumberGuess {
    public static void main(String[] args){
//        for(int i=0;i<100;i++)
//        System.out.println((int)(Math.random()*1000+1));
        int random=(int)(Math.random()*1000+1);

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入猜测的数字：");
        int guessNum=scanner.nextInt();

        while (guessNum!=random){
            if(guessNum==0){
                System.out.println("退出游戏");
                return;
            }
            if(guessNum>random){
                System.out.println("太大了");
            }else {
                System.out.println("太小了");
            }
            System.out.println("请重新输入（0退出游戏）：");
            guessNum=scanner.nextInt();

        }
        System.out.println("恭喜你猜对了");
    }
}
