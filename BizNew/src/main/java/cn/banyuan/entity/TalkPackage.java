package cn.banyuan.entity;

import cn.banyuan.service.CallService;
import cn.banyuan.service.SendService;

public class TalkPackage extends ServicePackage implements CallService, SendService {
    public int talkTime;
    public int smsCount;

    @Override
    public void showInfo() {
        /**/
        System.out.println("套餐类型：话痨套餐");
        System.out.println("通信时长："+talkTime+"分钟");
        System.out.println("短信条数："+smsCount+"条");
        System.out.println("月资费："+price+"元");
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
}
