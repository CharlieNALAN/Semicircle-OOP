package cn.banyuan.demo2;

public class TheftproofDoor extends Door implements Lock{
    @Override
    void open() {
        System.out.println("开门。。。");
    }

    @Override
    void close() {
        System.out.println("关门。。。");
    }

    @Override
    public void openLock() {
        System.out.println("开锁。。。");
    }

    @Override
    public void closeLock() {
        System.out.println("上锁。。。");
    }
}
