package cn.banyuan.practice1;

public final class Bus extends MotorVehicle{
    private int seatCount;

    public Bus(String no, int seatCount) {
        super(no, "金龙", "白色", 0);
        this.seatCount=seatCount;
    }

    @Override
    public int CalcRent(int days) {
        if(seatCount>16)
            return 1500*days;
        else
            return 800*days;
    }
}
