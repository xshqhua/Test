package study;

/**
 * Created by qinghan on 2017/6/13.
 */
public class yangHuiTriangle {
    public static void main(String[] args){
        final int row=5;
        int a[][]=new int[row+1][];
        //初始化数组
        for (int i = 0; i <=row ; i++) {
            a[i]=new int[i+1];
        }
        yangHui(a,row);

    }
    public static void yangHui(int a[][],int row){
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= a[i].length-1; j++) {
                if(i==0 || j==0 || j==a[i].length-1){
                    a[i][j]=1;
                }else {
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
            }
        }
        //输出
        for (int i = 0; i <=row ; i++) {
            for (int j = 0; j <= a[i].length-1 ; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
