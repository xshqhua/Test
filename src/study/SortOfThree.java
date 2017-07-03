package study;

import java.util.Scanner;

/**
 * Created by qinghan on 2017/7/2.
 */
public class SortOfThree {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[]  number=new int[3];
        int i=0;
        while(scanner.hasNext()){
            number[i]=scanner.nextInt();
            i++;
            if(i>=3)break;
        }

        for(int j=0;j<number.length-1;j++){
            for(int k=0;k<number.length-1;k++){
                if(number[k]>number[k+1]){
                    int tep=number[k];
                    number[k]=number[k+1];
                    number[k+1]=tep;
                }
            }
        }
        for(int j=0;j<number.length;j++){
            System.out.println(number[j]);
        }

    }
}
