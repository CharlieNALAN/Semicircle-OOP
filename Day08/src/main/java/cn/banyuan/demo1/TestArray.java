package cn.banyuan.demo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        Dog a = new Dog("aaa", "aaa");
        Dog b = new Dog("bbb", "bbb");
        Dog c = new Dog("ccc", "ccc");
        list.add(a);
        list.add(b);
        list.add(c);


        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.contains(a));

        list.remove(b);
        System.out.println(list.contains(b));
        System.out.println("--------------------------------------------");
        LinkedList<Dog> linkedList = new LinkedList<>();
        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);

        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }

        System.out.println(linkedList.contains(a));
        linkedList.remove();
        System.out.println(linkedList.contains(a));


    }
}
