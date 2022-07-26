package cn.banyuan.demo3;

public abstract class Pet {
    public abstract void bark();
    public abstract void eat();
    public void show(){
        System.out.println("i'm a pet");
    }
}

class Dog extends Pet{

    @Override
    public void bark() {
        System.out.println("汪汪");
    }

    @Override
    public void eat() {
        System.out.println("Eat bones");
    }
}


