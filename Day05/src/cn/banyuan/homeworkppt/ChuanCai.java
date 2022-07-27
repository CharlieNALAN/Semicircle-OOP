package cn.banyuan.homeworkppt;

public class ChuanCai extends Food{
    public ChuanCai() {
    }

    public ChuanCai(String foodType) {
        super(foodType);
    }

    @Override
    public int calcMoney() {
        if("大份".equals(getFoodType())){
            return 30;
        }else
            return 20;
    }
}

