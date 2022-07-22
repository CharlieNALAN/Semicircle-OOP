package cn.banyuan.homework3;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.addStudent("aaa",10,78.1);
        s.addStudent("bbb",12,71.1);
        s.addStudent("ccc",20,22.1);
        s.addStudent("ddd",30,11.4);
        s.addStudent("eee",24,44.6);
        s.addStudent("fff",20,50.0);
        s.addStudent("ggg",21,100.0);

        s.showStudent();
    }
}
