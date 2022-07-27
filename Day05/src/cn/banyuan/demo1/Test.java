package cn.banyuan.demo1;

public class Test {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Master m = new Master();
        dog.setHealth(10);
        m.goHealth(dog);
        System.out.println(dog.getHealth());
    }
}
