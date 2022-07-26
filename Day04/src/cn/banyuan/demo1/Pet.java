package cn.banyuan.demo1;

public class Pet {
     private String name;
    private String sex;
    private int age;

    public Pet() {
        System.out.println("父类无参");
    }

    public Pet(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        System.out.println("父类有参");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
