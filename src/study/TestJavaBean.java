package study;

import java.lang.reflect.Type;

/**
 * Created by qinghan on 2017/6/29.
 */
public class TestJavaBean {
    public String name;
    private boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 7, 9, 8, 2};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
//            if(max<array[i]){
//                max=array[i];
//            }else if(min>array[i]){
//                min=array[i];
//            }

//            max = max < array[i] ? array[i] : max;
//            min = min > array[i] ? array[i] : min;

            Object m = max < array[i] ? max = array[i] : min > array[i] ? min = array[i] : min;

        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(100+200+"str");
        System.out.println("str"+100+200);
    }
}
