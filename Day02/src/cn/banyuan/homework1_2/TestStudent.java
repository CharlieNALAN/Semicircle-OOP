package cn.banyuan.homework1_2;

public class TestStudent {
    public static void main(String[] args) {
        StudentBiz stu = new StudentBiz();

        stu.addName("张三");
        stu.addName("李四");
        stu.addName("aaa");
        stu.addName("bbb");
        stu.addName("ccc");
        stu.addName("ddd");
        stu.addName("eee");

        stu.showName();
        System.out.println();
        boolean isFind = stu.searchName(0,5,"aaa");
        System.out.println(isFind);
    }
}
