package cn.banyuan.homework4;

public class Student {
    String name;
    int age;
    int cls;
    String hobby;

    public void getInfo(){
        System.out.println(name);
        System.out.println("年龄："+age);
        System.out.println("就读于："+cls+"班");
        System.out.println("爱好："+hobby);
    }

}
