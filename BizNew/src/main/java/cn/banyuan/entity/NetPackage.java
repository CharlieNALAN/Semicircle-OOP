package cn.banyuan.entity;

import cn.banyuan.service.NetService;

public class NetPackage extends ServicePackage implements NetService {
    public int flow;

    public NetPackage() {
        price = 68;
        flow = 1024*3;
    }

    @Override
    public void showInfo() {
        System.out.println("网虫套餐：上网流量为3G/月");
    }

    @Override
    public int netPlay(int flow, MobileCard card) {
        return 0;
    }
}
