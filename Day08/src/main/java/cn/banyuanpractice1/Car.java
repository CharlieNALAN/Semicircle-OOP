package cn.banyuanpractice1;

public final class Car extends MotorVehicle{
    public Car( String name, String brand, int rent) {
        super( name, brand, rent);
    }

    @Override
    public double CalcRent(int days) {
        if(days<7)
            return getRent()*days;
        else if(days<30)
            return getRent()*days*0.9;
        else if(days<150)
            return getRent()*days*0.8;
        else
            return getRent()*days*0.7;
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}