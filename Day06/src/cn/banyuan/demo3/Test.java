package cn.banyuan.demo3;

public class Test {
    public static void main(String[] args) {
        AptitudeHandset iPhone = new AptitudeHandset("iPhone", "13");
        iPhone.info();
        iPhone.sendInfo();
        iPhone.call();
        iPhone.play("AAA");
        iPhone.networkConn();

        System.out.println();

        CommonHandset nokia = new CommonHandset("Nokia", "3310");
        nokia.info();
        nokia.sendInfo();
        nokia.call();
        nokia.play("BBB");

    }
}
