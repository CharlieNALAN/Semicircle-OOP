package cn.banyuan.demo1;

public class Dog extends Pet{

    public Dog() {
    }

    @Override
    public void goHealth() {
        setHealth(getHealth()+10);
    }

}
