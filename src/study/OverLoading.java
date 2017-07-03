package study;

/**
 * Created by qinghan on 2017/6/28.
 */
/*
* 判断方法重载的依据：

1、 必须是在同一个类中

2、 方法名相同

3、 方法参数的个数、顺序或类型不同

4、 与方法的修饰符或返回值没有关系
*/
public class OverLoading {
    public static void main(String[] args){
        OverLoading overLoading =new OverLoading();
        overLoading.show();
        overLoading.show("莉莉");
        overLoading.show("lili",18);
        overLoading.show(16,"aimi");

    }
    public void show(){//无参数方法
        System.out.println("Welcome");
    }
    public void show(String name){//重载show方法，有一个参数
        System.out.println("Welcome:"+name);
    }
    public void show(String name,int age){//重载show方法，有两个参数
        System.out.print("welcome:"+name+" ");
        System.out.println("Welcome:"+age);
    }
    public void show(int age,String name){//重载show方法，有两个参数，参数顺序不同
        System.out.print("welcome: name"+name+" ");
        System.out.println("Welcome:age"+age);
    }
}
