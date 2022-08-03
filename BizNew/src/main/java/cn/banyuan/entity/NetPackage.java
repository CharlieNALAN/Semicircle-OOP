package cn.banyuan.entity;

import cn.banyuan.service.NetService;

public class NetPackage extends ServicePackage implements NetService {
    public int flow;

    @Override
    public void showInfo() {

    }

    @Override
    public int netPlay(int flow, MobileCard card) {
        return 0;
    }
}
