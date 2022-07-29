package cn.banyuan.test.q17;

public class Team {
    Role[] teams = new Role[6];
    int total = 0;
    public void addMember(Role role){
        if(total>6){
            System.out.println("已满");
            return;
        }else{
            teams[total] = role;
            total++;
        }
    }

    public int attackSum(){
        int sum = 0;
        for(int i =0 ;i<total;i++){
            sum+=teams[i].attack();
        }
        return sum;
    }
}
