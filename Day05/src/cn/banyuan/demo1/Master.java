package cn.banyuan.demo1;

public class Master {
    public void goHealth(Pet pet){
        if(pet.getHealth()<80)
        {
            pet.goHealth();
        }
    }
}
