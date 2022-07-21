package cn.banyuan.homework4;

public class Adviser {
    String name;
    String direct;
    String course;
    int age;

    public void getInfo(){
        System.out.println(name);
        System.out.println("专业方向："+direct);
        System.out.println("教授课程："+course);
        System.out.println("教龄："+age);
    }
}
