package cn.banyuan.homeworkppt;

public class HuaiYang extends Food{
    public HuaiYang() {
    }

    public HuaiYang(String foodType) {
        super(foodType);
    }

    @Override
    public int calcMoney() {
        if("大份".equals(getFoodType())){
            return 20;
        }else
            return 15;
    }
}
