package cn.banyuan.practice1;

public class Seller {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sell(Excelle car){
        System.out.println(name+"卖出了一台凯越，类型为："+car.getType()+",ID为"+car.getId());
    }

    public void sell(Regal car){
        System.out.println(name+"卖出了一台君威，类型为："+car.getType()+",ID为"+car.getId());
    }

    public void sell(Excelle[] cars,int num){
        System.out.println(name+"卖出了"+num+"台君威");
        for(int i=0;i<cars.length;i++){
            System.out.println("第"+(i+1)+"台的类型为："+cars[i].getType()+".ID为"+cars[i].getId());
        }
    }
}
