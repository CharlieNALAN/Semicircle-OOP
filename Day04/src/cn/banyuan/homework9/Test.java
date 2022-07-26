package cn.banyuan.homework9;

public class Test {
    public static void main(String[] args) {
        Person tang = new Person("tangseng", 180, "fazhang", "ren");
        Person sun = new Person("sunwukong", 180, "jingubang", "hou");
        Person bai = new Person("baigujing", 100, "none", "yao");
        System.out.println(tang);
        System.out.println(sun);
        System.out.println(bai);
        System.out.println(tang.equals(sun));
    }
}
