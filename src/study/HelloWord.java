package study;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by qinghan on 2017/6/28.
 */
public class HelloWord {
    public static void main(String[] args) {
        HelloWord helloWord = new HelloWord();
//        int[] scores = {45, 65, 74, 81, 94};
        helloWord.Print();
//        System.out.print(string);
//
//        Date date=new Date();
//        String d= helloWord.printDate(date);
//        System.out.println(d);

    }

    public void Print() {
        int[] scores = {45, 65, 74, 81, 94};
        Date date=new Date();
        printDate(date,scores);
       // Arrays.toString(scores);
    }
    public void printDate(Date date,int[] scores){
        System.out.println(date);
        int sum=0;
        for (int score:scores){
            sum+=score;
        }
        System.out.println(sum);
    }
}
