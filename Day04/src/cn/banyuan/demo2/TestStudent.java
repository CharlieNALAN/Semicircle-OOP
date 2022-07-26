package cn.banyuan.demo2;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("hhh", 111);
        Student s2 = new Student("hhh", 111);
        System.out.println(s1.equals(s2));
    }
}
