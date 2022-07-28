package cn.banyuan.practice_ppt1;

public class Printer implements InkBox,Paper{
    String ink;
    String paper;

    public Printer(String ink, String paper) {
        this.ink = ink;
        this.paper = paper;
    }

    @Override
    public void setInk() {
        System.out.println("设置墨水为"+this.ink);
    }

    @Override
    public void paper() {
        System.out.println("设置纸张为"+this.paper);
    }
    public void info(){
        setInk();
        paper();
    }
}
