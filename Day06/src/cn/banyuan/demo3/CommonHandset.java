package cn.banyuan.demo3;

public class CommonHandset extends HandSet implements PlayWiring{
    public CommonHandset() {
    }

    public CommonHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendInfo() {
        System.out.println("发送文字信息");
    }

    @Override
    public void call() {
        System.out.println("语音通话");
    }

    @Override
    public void info() {
        System.out.println("这是一台"+getBrand()+",型号："+getType());
    }

    @Override
    public void play(String content) {
        System.out.println("正在播放"+content);
    }
}
