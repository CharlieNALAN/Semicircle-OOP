package cn.banyuan.demo1;

public abstract class Pet {
    private int health;

    public Pet() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void goHealth();
}
