package cn.banyuan.demo2;

public class JuiceMachine {
    public String zha(String fruit,int num){
        return fruit+"汁"+num+"杯";
    }


    public static void main(String[] args) {
        JuiceMachine jm = new JuiceMachine();
        String ans = jm.zha("苹果",2);
        System.out.println(ans);
    }


}
