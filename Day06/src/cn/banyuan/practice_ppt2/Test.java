package cn.banyuan.practice_ppt2;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.showCPU("Intel");
        c.showEMS("16G");
        c.showDisk("1T");
        System.out.println(c);
    }
}
