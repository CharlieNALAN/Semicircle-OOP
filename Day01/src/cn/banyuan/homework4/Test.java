package cn.banyuan.homework4;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name="张青";
        s.age=10;
        s.cls=51;
        s.hobby="篮球";

        Adviser ad = new Adviser();
        ad.name = "王老师";
        ad.direct="计算机";
        ad.course="JAVA";
        ad.age=5;

        s.getInfo();
        System.out.println();
        ad.getInfo();
    }
}
