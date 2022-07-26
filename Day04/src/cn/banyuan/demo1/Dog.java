package cn.banyuan.demo1;

public class Dog extends Pet{
    private String strain;

    public Dog() {
        System.out.println("子类午餐");
    }

    public Dog(String name, String sex, int age, String strain) {
        super(name, sex, age);
        this.strain = strain;
        System.out.println("子类有参");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "strain='" + strain + '\'' +
                '}';
    }
}
