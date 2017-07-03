package study;

/**
 * Created by qinghan on 2017/6/14.
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int test[] = {2, 3, 5, 43, 2, 12, 31, 77, 100};
        for (int x : test) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();

        //arrayReverse arrayReverse=new arrayReverse();
        int[] array1 = arrayReverse(test);//类可以直接调用静态方法
        for (int a : array1) {
            System.out.print(a);
            System.out.print(" ");
        }
    }

    public static int[] arrayReverse(int[] array) {//静态方法
        int[] result = new int[array.length];
        for (int i = 0, j = result.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
        }
        return result;
    }
}
