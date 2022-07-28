package cn.banyuan.demo3;

public class AptitudeHandset extends HandSet implements TakePicture,Network,PlayWiring{
    public AptitudeHandset() {
    }

    public AptitudeHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendInfo() {
        System.out.println("发送图片和文字信息");
    }

    @Override
    public void call() {
        System.out.println("视频通话");
    }

    @Override
    public void info() {
        System.out.println("这是"+getBrand()+",型号："+getType());
    }

    @Override
    public void networkConn() {
        System.out.println("已连接网络");
    }

    @Override
    public void play(String content) {
        System.out.println("正在播放"+content);
    }

    @Override
    public void takePicture() {
        System.out.println("拍照。。。");
    }
}
