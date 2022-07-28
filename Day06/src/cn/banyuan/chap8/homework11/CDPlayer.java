package cn.banyuan.chap8.homework11;

public class CDPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("播放CD");
    }

    @Override
    public void stop() {
        System.out.println("CD停止播放");
    }

    @Override
    public void open() {
        System.out.println("CD打开");
    }
}
