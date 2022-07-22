package cn.banyuan.homework1;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="aaa";
        student.gender="男";
        student.score = 99.8;
        student.id=111;
        System.out.println(student.say());

    }
}
