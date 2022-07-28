package cn.banyuan.chap8.homework11;

public class TapePlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("磁带开始");
    }

    @Override
    public void stop() {
        System.out.println("磁带停止");
    }

    @Override
    public void open() {
        System.out.println("磁带打开");
    }
}
