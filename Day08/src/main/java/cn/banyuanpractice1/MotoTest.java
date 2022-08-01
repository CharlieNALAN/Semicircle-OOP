package cn.banyuanpractice1;

import java.util.HashMap;
import java.util.Map;

public class MotoTest {
    Map<String,MotorVehicle> mp = new HashMap<>();
    public void init(){
        mp.put("京NY28588",new Car("宝马X6","宝马",800));
        mp.put("京CNY3284",new Car("宝马550i","宝马",600));
        mp.put("京NT37465",new Car("别克林荫大道","别克",300));
        mp.put("京NT96968",new Car("别克GL8","别克",600));
        mp.put("京6566754",new Car("金杯16座","金杯",800));
        mp.put("京8696997",new Car("金龙16座","金龙",800));
        mp.put("京9696996",new Car("金杯34座","金杯",1500));
        mp.put("京8696998",new Car("金龙34座","金龙",1500));
    }

    public MotorVehicle searchMoto(String motoNo){
        return mp.get(motoNo);
    }
}
