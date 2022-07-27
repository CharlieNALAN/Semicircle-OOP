package cn.banyuan.homeworkppt;

public abstract class Food {
    private String foodType;// 大份/小份

    public Food() {
    }

    public Food(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public abstract int calcMoney();
}
