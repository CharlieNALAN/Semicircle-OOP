package cn.banyuan.test.q17;

public abstract class Role {
    private String name;
    public abstract int attack();

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
