package cn.banyuan.homeworkppt;

public class XXXBiz {
    public int totalOrderMoney(Food[] foods,int foodNum){
        int sum=0;
        for(int i=0;i<foodNum;i++){
            sum+=foods[i].calcMoney();
        }
        return sum;
    }


}
