package cn.banyuanpractice1;

public class Bus extends MotorVehicle{
    public Bus( String name, String brand, int rent) {
        super( name, brand, rent);
    }

    @Override
    public double CalcRent(int days) {
        if(days<3)
            return getRent()*days;
        else if(days<7)
            return getRent()*days*0.9;
        else if(days<30)
            return getRent()*days*0.8;
        else if(days<150)
            return getRent()*days*0.7;
        else
            return getRent()*days*0.6;
    }

    @Override
    public String toString() {
        return "Bus{} " + super.toString();
    }
}
