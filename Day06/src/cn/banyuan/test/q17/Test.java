package cn.banyuan.test.q17;

public class Test {
    public static void main(String[] args) {
        Team team = new Team();
        Magicer m1 = new Magicer("aaa", 10);
        Magicer m2 = new Magicer("bbb", 20);
        Soldier s1 = new Soldier("ccc", 50);
        team.addMember(m1);
        team.addMember(m2);
        team.addMember(s1);
        System.out.println(team.attackSum());
    }
}
