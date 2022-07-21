package cn.banyuan.homework2;

public class Test {
    public static void main(String[] args) {
        Husband husband = new Husband();
        husband.name="aaa";
        husband.age=44;
        Wife wife = new Wife();
        husband.wf=wife;
        wife.name="bbb";
        wife.age=22;
        wife.hb=husband;
        husband.getInfo();
        wife.getInfo();
    }
}
