package cn.banyuan.homework8;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("aaa", "male", 18, "111");
        Student s2 = new Student("aaa", "male", 18, "111");
        System.out.println(s1.equals(s2));
    }
}
