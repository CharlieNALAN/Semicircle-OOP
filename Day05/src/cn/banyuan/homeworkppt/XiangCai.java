package cn.banyuan.homeworkppt;

public class XiangCai extends Food{
    public XiangCai() {
    }

    public XiangCai(String foodType) {
        super(foodType);
    }

    @Override
    public int calcMoney() {
        if("大份".equals(getFoodType())){
            return 40;
        }else
            return 25;
    }
}
