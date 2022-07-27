package cn.banyuan.chap6.homework17;

public class Team {
    private Role[] team = new Role[6];
    private int total = 0;
    public void addMember(Role role){
        if(total<6)
            team[total++] = role;
        else
            System.out.println("队伍已满");
    }

    public int attackSum(){
        int sum = 0;
        for(int i=0;i<total;i++){
            sum+=team[i].attack();
        }
        return sum;
    }
}
