package cn.banyuan.entity;

import cn.banyuan.service.CallService;
import cn.banyuan.service.NetService;
import cn.banyuan.service.SendService;

public class SuperPackage extends ServicePackage implements CallService, SendService, NetService {
    public int talkTime;
    public int smsCount;
    public int flow;

    public SuperPackage() {
        price = 78;
        talkTime = 200;
        flow = 1024;
        smsCount = 50;
    }

    @Override
    public void showInfo() {
        System.out.println("超人套餐：通话时长200分钟/月，流量1G/月,短信50条/月" );
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
