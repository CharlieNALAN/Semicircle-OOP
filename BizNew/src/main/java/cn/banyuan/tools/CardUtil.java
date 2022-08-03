package cn.banyuan.tools;

import cn.banyuan.entity.*;

import java.text.DecimalFormat;
import java.util.*;

public class CardUtil {
    Map<String, MobileCard> cards;
    Map<String, List<ConsumInfo>> consumInfos;

    Random random = new Random();
    public void initScene(){
        cards = new HashMap<>();
        consumInfos = new HashMap<>();
        MobileCard t1 = new MobileCard("13900000000", "aaa", "123");
        t1.setConsumAmount(89);
        t1.setSerPackage(new SuperPackage());
        t1.setRealFlow(10);
        t1.setRealSMSCount(12);
        t1.setRealTalkTime(23);
        cards.put("13900000000",t1);
        ConsumInfo c1 = new ConsumInfo(t1.getCardNumber(), "通话", 20);
        List<ConsumInfo> t = new ArrayList<>();
        t.add(c1);
        consumInfos.put(t1.getCardNumber(),t);
    }

    public boolean isExistCard(String number, String password){
        return cards.containsKey(number) && cards.get(number).getPassWord().equals(password);
    }

    public boolean isExistCard(String number){
        return cards.containsKey(number);
    }

    public String creatNumber(){
        StringBuilder ans = new StringBuilder("139");
        for(int i=0;i<8;i++){
            int num = random.nextInt(10);
            ans.append(num);
        }
        return ans.toString();
    }

    public String[] getNewNumbers(int count){
        String[] ans = new String[count];
        for(int i=0;i<ans.length;i++){
            ans[i]=creatNumber();
        }
        return ans;
    }

    public void addCard(MobileCard card){
        cards.put(card.getCardNumber(),card);
    }

    public void delCard(String number){

    }
    public void billQuery(String number){
        DecimalFormat format= new DecimalFormat("#.0");
        String price = format.format(cards.get(number).getSerPackage().getPrice());
        String amount = format.format(cards.get(number).getConsumAmount());
        String left = format.format(cards.get(number).getMoney());
        System.out.println("您的卡号为："+number+",当月账单:");
        System.out.println("套餐资费为"+price+"元");
        System.out.println("合计:"+amount+"元");
        System.out.println("账户余额:"+left+"元");
    }
    public void showRemainDetail(String number){

        System.out.println("***套餐余量查询***");
        MobileCard tmp = cards.get(number);
        System.out.println("您的卡号是"+tmp.getCardNumber()+",套餐内剩余:");
        int leftTalkTime = 0, leftSMSCount =0;
        double leftFlow = 0;
        if(tmp.getSerPackage() instanceof TalkPackage){
            if(tmp.realTalkTime<((TalkPackage) tmp.getSerPackage()).talkTime)
                leftTalkTime = ((TalkPackage) tmp.getSerPackage()).talkTime-tmp.realTalkTime;
            if(tmp.realSMSCount<((TalkPackage) tmp.getSerPackage()).smsCount)
                leftSMSCount = ((TalkPackage) tmp.getSerPackage()).smsCount-tmp.realSMSCount;
            System.out.println("通话时长："+leftTalkTime);
            System.out.println("短信条数："+leftSMSCount);
        }else if(tmp.getSerPackage() instanceof NetPackage){
            if(tmp.realFlow< ((NetPackage) tmp.getSerPackage()).flow)
                leftFlow = (double)(((NetPackage) tmp.getSerPackage()).flow-tmp.realFlow)/1024;
            System.out.println("上网流量:"+leftFlow);
        }else{
            if(tmp.realTalkTime<((SuperPackage)tmp.getSerPackage()).talkTime){
                leftTalkTime = ((SuperPackage) tmp.getSerPackage()).talkTime-tmp.realTalkTime;
            }
            if(tmp.realSMSCount<((SuperPackage)tmp.getSerPackage()).smsCount){
                leftSMSCount = ((SuperPackage) tmp.getSerPackage()).smsCount-tmp.realSMSCount;
            }
            if(tmp.realFlow<((SuperPackage)tmp.getSerPackage()).flow){
                leftFlow = (double) (((SuperPackage) tmp.getSerPackage()).flow-tmp.realFlow)/1024;
            }
            System.out.println("通话时长："+leftTalkTime+"分钟");
            System.out.println("短信条数："+leftSMSCount+"条");
            System.out.println("上网流量:"+leftFlow+"G");
        }


    }

    public void showAmountDetail(String number){

    }

    public void addConsumInfo(String number,ConsumInfo info){

    }

    public void useSoso(String number){

    }

    public void showDescription(){

    }

    public void changingPack(String number,String packNum){

    }

    public void printConsumInfo(String number){
        System.out.println("****"+number+"消费记录****");
        System.out.println("序号\t\t类型\t\t数据（通话（条）/上网(MB)/短信（条）");
        MobileCard tmp = cards.get(number);
        List<ConsumInfo> temp = consumInfos.get(tmp.getCardNumber());
        Iterator<ConsumInfo> it = temp.iterator();
//
        int i=1;
//        while(it.hasNext()){
//            System.out.print(i+"\t\t");
//            String type = it.next().type;
//            int data = it.next().consumData;
//            System.out.println(type+"\t\t"+data);
//        }
        for(ConsumInfo s:temp){
            System.out.println(i+"\t\t"+s.type+"\t\t"+s.consumData);
            i++;
        }

    }

    public void chargeMoney(String number,double money){

    }

}
