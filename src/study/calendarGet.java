package study;

import java.util.Calendar;

/**
 * Created by qinghan on 2017/6/14.
 */
public class calendarGet {
    public static void main(String[] args){
        //Calendar类是一个抽象类，在实际使用时实现特定的子类的对象，
        // 创建对象的过程对程序员来说是透明的，只需要使用getInstance方法创建即可。
        //创建一个代表系统当前日期的Calendar对象
        Calendar calendar=Calendar.getInstance();//默认是当前日期

        // 获得年份
        int year=calendar.get(Calendar.YEAR);
        System.out.println(year);
        // 获得月份
        int month=calendar.get(Calendar.MONTH)+1;
        System.out.println(month);
        // 获得日期
        int date=calendar.get(Calendar.DATE);
        System.out.println(date);
        // 获得小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
        // 获得分钟
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println(minute);
        // 获得秒
        int second = calendar.get(Calendar.SECOND);
        System.out.println(second);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);

    }
}
