package cn.banyuan.homeworkppt;

public class Test {
    public static void main(String[] args) {
        Food[] foods = new Food[4];
        foods[0] = new HuaiYang("小份");
        foods[1] = new ChuanCai("大份");
        foods[2] = new XiangCai("大份");
        foods[3] = new XiangCai("小份");
        XXXBiz biz = new XXXBiz();
        int money = biz.totalOrderMoney(foods,4);
        System.out.println(money);
    }
}
