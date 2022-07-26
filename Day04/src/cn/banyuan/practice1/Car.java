package cn.banyuan.practice1;

public final class Car extends MotorVehicle{
    private final String type;

    public Car(String no, String brand,String type) {
        super(no, brand, "white", 0);
        this.type=type;
    }

    @Override
    public int CalcRent(int days) {
        if("别克".equals(this.getBrand())){
            return 600*days;
        }else{
            return 500*days;
        }
    }
}
