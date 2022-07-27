package cn.banyuan.chap6.homework17;

public class Test {
    public static void main(String[] args) {
        Team team = new Team();
        Magicer m1 = new Magicer("aaa", 2);
        Magicer m2 = new Magicer("bbb", 1);
        Soldier s1 = new Soldier("ccc",10);
        team.addMember(m1);
        team.addMember(m2);
        team.addMember(s1);
        System.out.println(team.attackSum());
    }
}
