package cn.banyuan.chap10.homework5;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        Worker zhang3 = new Worker("zhang3", 18, 3000);
        Worker li4 = new Worker("li4", 25, 3500);
        Worker wang5 = new Worker("wang5", 22, 3200);

        workers.add(zhang3);workers.add(li4);workers.add(wang5);
        for(int i=0;i<workers.size();i++){
            if(workers.get(i).equals(li4)){
                workers.add(i,new Worker("zhao6",24,3300));
                break;
            }
        }

        for(int i=0;i<workers.size();i++){
            System.out.println(workers.get(i).getName());
        }
        System.out.println("------------------------");
        for(int i=0;i<workers.size();i++){
            if(workers.get(i).equals(wang5)){
                workers.remove(i);
                break;
            }
        }
        for(int i=0;i<workers.size();i++){
            System.out.println(workers.get(i).getName());
        }
        System.out.println("-----------------------");
        for(Worker w:workers){
            System.out.println(w.getName());
        }

        System.out.println("--------------------------");
        Iterator<Worker> it = workers.iterator();
        while(it.hasNext()){

            it.next().work();

        }
    }



}
