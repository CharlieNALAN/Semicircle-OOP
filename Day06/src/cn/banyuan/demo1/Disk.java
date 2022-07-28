package cn.banyuan.demo1;

public class Disk implements Usb{
    @Override
    public void service() {
        System.out.println("服务启动");
    }
}
