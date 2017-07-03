package study;

import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by qinghan on 2017/6/14.
 */
public class RegexMatches {
    public static void main(String[] args) {
        RegexMatches rm=new RegexMatches();
        rm.RegexMatch();
        rm.regexMatchSE();
        rm.regexMatch1();
        rm.regexMatch2();
    }

    public void RegexMatch(){
        String line = "This order was placed for QT3000! OK?";
        String pattern="(\\D*)(\\d+)(.*)";

        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(line);
        /*
        * 可以通过调用 matcher 对象的 groupCount 方法来查看表达式有多少个分组。
        * groupCount 方法返回一个 int 值，表示matcher对象当前有多个捕获组。
        * 还有一个特殊的组（group(0)），它总是代表整个表达式。该组不包括在 groupCount 的返回值中。
        * */
        int g=m.groupCount();
        System.out.println(g);

        if(m.find()){ //尝试查找与该模式匹配的输入序列的下一个子序列。
            System.out.println("Found value: "+m.group(0));//（group(0)），它总是代表整个表达式
            System.out.println("Found value: "+m.group(1));
            System.out.println("Found value: "+m.group(2));
            System.out.println("Found value: "+m.group(3));
        }else {
            System.out.println("NO Match");
        }
    }

    public void regexMatchSE(){
        String line="cat cat cat cattie cat";
        String pattern="\\bcat\\b";

        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(line);

        int count=0;
        while (m.find()){
            count++;
            System.out.println("Match number:"+count);
            System.out.println("start():"+m.start());
            System.out.println("end():"+m.end());
        }

    }

    public void regexMatch1(){
        String line1="fooooooooooooooooo";
        String line2="ooooofoooooooooooo";
        String pattern="foo";

        Pattern p=Pattern.compile(pattern);
        Matcher m1=p.matcher(line1);
        Matcher m2=p.matcher(line2);
        /*
        * matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。
        * 它们的不同是 matcher 要求整个序列都匹配，而lookingAt 不要求。
        * lookingAt 方法虽然不需要整句都匹配，但是需要从第一个字符开始匹配。
        * **/
        System.out.println(m1.lookingAt());
        System.out.println(m2.lookingAt());
        System.out.println(m1.matches());
        System.out.println(m2.matches());

    }

    public void regexMatch2(){
        String line="The dog says meow." +"All dogs say meow.";
        String pattern="dog";
        String replace="cat";

        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(line);

        line=m.replaceAll(replace);

        System.out.println(line);
    }

}
