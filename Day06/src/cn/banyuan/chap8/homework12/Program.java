package cn.banyuan.chap8.homework12;

public class Program {
    private Performer[] ps;
    public Program(){
        ps = new Performer[3];
        ps[0] = new Singer();
        ps[1] = new Dancer();
        ps[2] = new Player();
    }

    public void show(){
        for(int i=0;i<ps.length;i++){
            ps[i].perform();
        }
    }
}
