package cn.banyuan.demo1;

public class Dog {
    int num;
    String name;
    int love;

    static int number = 10;

    public Dog(int num, String name, int love) {
        this();
        this.num = num;
        this.name = name;
        this.love = love;
        System.out.println("有参构造");
        System.out.println(this);
    }

    public Dog() {
        System.out.println("无参构造");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", love=" + love +
                '}';
    }

    public void m1(){
        m2();
        System.out.println("m1");
    }

    public static void m2(){
        number = 12;
        System.out.println("static m2");
    }
}
