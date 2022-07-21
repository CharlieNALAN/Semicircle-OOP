package cn.banyuan.oop;

public class Person {

    String name;
    int age;

    @Override
    public String toString() {
        return "name:"+name+",age:"+age;
    }

    public void show(){
        System.out.println("name:"+name+",age:"+age);
    }
}
