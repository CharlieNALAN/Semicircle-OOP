package cn.banyuan.chap6.homework17;

public class Soldier extends Role{
    private int atk;

    public Soldier() {
    }

    public Soldier(String name, int atk) {
        super(name);
        this.atk = atk;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public int attack() {
        return atk;
    }
}
