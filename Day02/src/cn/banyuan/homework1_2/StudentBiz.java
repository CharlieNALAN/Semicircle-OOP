package cn.banyuan.homework1_2;

public class StudentBiz {
    String[] names = new String[10];
    int total = 0;

    public void addName(String name){
        names[total] =  name;
        total++;
    }

    public void showName(){
        for(int i=0;i<total;i++){
            System.out.print(names[i]+" ");
        }
    }

    public boolean searchName(int start,int end,String name){
        if(start<0||start>total-1||end<0||end>total-1){
            System.out.println("范围输入有问题");
            return false;
        }
        boolean flag =false;
        for(int i=start;i<end;i++){
            if(names[i].equals(name)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
