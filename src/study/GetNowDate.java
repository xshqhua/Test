package study;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import java.text.*;

/**
 * Created by qinghan on 2017/6/14.
 */
/*
*
* 使用printf格式化日期
printf 方法可以很轻松地格式化时间和日期。使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。
转  换  符
说    明
示    例
c
包括全部日期和时间信息
星期六 十月 27 14:21:20 CST 2007
F
"年-月-日"格式
2007-10-27
D
"月/日/年"格式
10/27/07
r
"HH:MM:SS PM"格式（12时制）
02:25:51 下午
T
"HH:MM:SS"格式（24时制）
14:28:16
R
"HH:MM"格式（24时制）
14:28
*/
public class GetNowDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");//E是星期几
        System.out.println("Current Date: " + sdf.format(date));

        //C的使用
        System.out.printf("1 全部日期和时间信息：%tc%n", date);
        //D的使用
        System.out.printf("2 年-月-日：%tD%n", date);
        //r的使用
        System.out.printf("3 月/日/年：%tr%n", date);
        //T的使用
        System.out.printf("4 HH:MM:SS PM 格式（12时制）：%tT%n", date);
        //R的使用
        System.out.printf("5 HH:MM 格式（24时制）：%tR%n", date);

        //解析字符串中的日期
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        //String input="0?'2018-6-14'233344";
        String input = args.length == 0 ? "1818-11-11" : args[0];
        try {
            Date t = sf.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("异常");

        }

    }
}
