package cn.banyuan.entity;

import cn.banyuan.service.CallService;
import cn.banyuan.service.NetService;
import cn.banyuan.service.SendService;

public class SuperPackage extends ServicePackage implements CallService, SendService, NetService {
    public int talkTime;
    public int smsCount;
    public int flow;

    @Override
    public void showInfo() {

    }

    @Override
    public int call(int minCount, MobileCard card) {
        return 0;
        /**/
    }

    @Override
    public int send(int count, MobileCard card) {
        return 0;
        /**/
    }

    @Override
    public int netPlay(int flow, MobileCard card) {
        return 0;
        /**/
    }
}
