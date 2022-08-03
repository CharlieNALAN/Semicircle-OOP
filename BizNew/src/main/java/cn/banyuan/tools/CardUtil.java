package cn.banyuan.tools;

import cn.banyuan.entity.ConsumInfo;
import cn.banyuan.entity.MobileCard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CardUtil {
    Map<String, MobileCard> cards;
    Map<String, List<ConsumInfo>> consumInfos;

    Random random = new Random();
    public void initScene(){
        cards = new HashMap<>();
        consumInfos = new HashMap<>();
        MobileCard t1 = new MobileCard("13900000000", "aaa", "123");
        cards.put("13900000000",t1);
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

    public void showRemainDetail(String number){

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

    }

    public void chargeMoney(String number,double money){

    }

}
