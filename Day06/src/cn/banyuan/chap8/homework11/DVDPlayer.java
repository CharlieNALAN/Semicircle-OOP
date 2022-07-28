package cn.banyuan.chap8.homework11;

public class DVDPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("DVD播放");
    }

    @Override
    public void stop() {
        System.out.println("DVD停止");
    }

    @Override
    public void open() {
        System.out.println("DVD打开");
    }
}
