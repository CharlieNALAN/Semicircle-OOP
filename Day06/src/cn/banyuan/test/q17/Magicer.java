package cn.banyuan.test.q17;

public class Magicer extends Role{
    private int magicLvl;

    public Magicer() {
    }

    public Magicer(String name, int magicLvl) {
        super(name);
        this.magicLvl = magicLvl;
    }

    public int getMagicLvl() {
        return magicLvl;
    }

    public void setMagicLvl(int magicLvl) {
        this.magicLvl = magicLvl;
    }

    @Override
    public int attack() {
        return magicLvl*5;
    }
}
