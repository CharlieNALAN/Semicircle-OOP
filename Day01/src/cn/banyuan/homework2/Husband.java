package cn.banyuan.homework2;

public class Husband {
    String name;
    int age;
    Wife wf;

    public void getInfo(){
        System.out.println("姓名:"+name+",年龄："+age+"，妻子姓名："
                +wf.name+"，妻子年龄："+wf.age);
    }
}
