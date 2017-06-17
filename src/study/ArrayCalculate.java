package study;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by qinghan on 2017/6/17.
 */
//1、随机初始化一个数组，数组长度为30，类型为int，范围0-50
//2、数组里的数字不重复
//3、（1）复制一份，放在另一个数组a[]
//  （2）直接复制在数组后面，数组长度增加一倍b[]
// 4、随机产生两个数组长度不同，把这两个数组合并，结果从小到大顺序，从大到小顺序
//
// 5、（1）计算数组最大值，最小值，平均值，还有和，
//   （2）重载，要什么任一功能给什么(array[],String)
//
public class ArrayCalculate {
    public static void main(String[] args){
        ArrayCalculate arrayCalculate=new ArrayCalculate();
        arrayCalculate.init();
    }

    public void init(){
       // int[] array=randomArray(30,0,50);
       //noRepeatArray(array);
       // int[] array1=noRepeatArray1(array);
        int[] array2=copyArray(array,2);

        int[] array3=randomArray(30,0,50);
        print(array3);
        int[] array4=randomArray(20,0,50);
        print(array4);
        int[] tarArray=combine(array3,array4);
        print(tarArray);

    }
    public void print(int[] tarArray){

        for (int i = 0; i < tarArray.length; i++) {
            System.out.print(tarArray[i]+" ");
        }
        System.out.println();
    }

    public int[] randomArray(int length,int start ,int end){
        int[] array=new int [length];
        Random random=new Random();
        for (int i = 0; i <array.length ; i++) {
            array[i]=random.nextInt(end)+start;
        }
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j]+" ");
//        }
//        System.out.println();
        return array;
    }
    public int[] noRepeatArray(int[] array){
        int index=0;
        int count=0;
        //重复数置0
        for (int i = 0; i < array.length; i++) {
                if(array[index]==array[i]){
                    count++;
                    array[i]=-1;
                    index++;
                }
        }
        //不重复的数复制到另一个数组
        int arr[]=new int[array.length-count];
        int k=0;
        for (int j = 0; j <array.length ; j++) {
                if(array[j]!=-1){
                    arr[k]=array[j];
                    k++;
                }
        }
        //输出
        for (k = 0; k < arr.length; k++) {
            System.out.print(array[k]+" ");
        }
        System.out.println();
        return arr;
    }
    public int[] noRepeatArray1(int[] array){
        int index=0;
        int count=0;
        int tar[]=new int[array.length];
        tar[0]=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[index]!=array[i]){
                count++;
                index++;
                tar[index]=array[i];
            }
        }
//        for (int j = 0; j < tar.length; j++) {
//            System.out.print(tar[j]+" ");
//        }
//        System.out.println();
        return tar;
    }
    public int[] copyArray(int[] array,int number){

        int[] tarArray=null;

        if(number==1){
            //int[] array1=new int[array.length];
            tarArray=new int[array.length];
            for (int i = 0; i < array.length; i++) {
                tarArray[i]=array[i];
            }
//            for (int j = 0; j < array1.length; j++) {
//                System.out.print(array1[j]+" ");
//            }
//            System.out.println();
//            return tarArray;
        }
        else if(number==2){
            tarArray=new int[array.length*2];

            for (int i = 0;i < array.length; i++) {
                tarArray[i]=array[i];
            }

            for (int i = 0;i < array.length; i++) {
                tarArray[i+array.length]=array[i];
            }
//            for (int k = 0; k < array1.length; k++) {
//                System.out.print(array1[k]+" ");
//            }
//            System.out.println();
           // return tarArray;
        }
        return tarArray;
    }
    public int[] combine(int[] array1,int[] array2){
        //array1=randomArray(30,0,50);
       // array2=randomArray(20,0,50);
        int length1=array1.length;
        int length2=array2.length;
        int[] tarArray=new int[length1+length2];
        for (int i = 0; i <length1 ; i++) {
            tarArray[i]=array1[i];
        }
        for (int i = 0; i <tarArray.length ; i++) {
            tarArray[i+length1]=array2[i];
        }
        return tarArray;
    }
    public int[] sortArray(int[] array,String str){

        return null;
    }
    public int[] comAndSortArray(){
        int[] array1=randomArray(30,0,50);
        int[] array2=randomArray(20,0,50);
        int[]array3=combine(array1,array2);
        int[] sort=sortArray(array3," ");
        return sort;
    }

    public Object[] calculate(int[] array){







        Object[] array1=new Object[] {4,1,2.5,7};
        return array1;
    }
    public Object calculate(int[] array,String str){
        String str1="MAX";
        String str2="MIN";
        String str3="AVG";
        String str4="SUM";
        Object object =new Object();
        if(str.equals(str1)){
            object=1;
        }else if(str.equals(str2)){

        }else if(str.equals(str3)){

        }else if(str.equals(str4)){

        }else{
            return null;
        }

        return object;
    }
}
