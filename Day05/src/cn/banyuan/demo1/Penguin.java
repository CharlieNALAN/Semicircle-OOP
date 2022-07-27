package cn.banyuan.demo1;

public class Penguin {
    private int health;

    public Penguin() {
    }

    public Penguin(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void goHospital(){
        health+=10;
    }
    @Override
    public String toString() {
        return "Penguin{" +
                "health=" + health +
                '}';
    }
}
