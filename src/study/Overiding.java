package study;

/**
 * Created by qinghan on 2017/6/28.
 */
public class Overiding {
    public static void main(String[] args){
        Student student=new Student();
        student.print();
    }

}
class Person{
    public void print(){
        System.out.println("Person");
    }
}
class Student extends Person{
    public void print(){
        super.print();
        System.out.println("Student extends Person");
    }
}
