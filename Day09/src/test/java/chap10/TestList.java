package chap10;

import java.util.ArrayList;
import java.util.List;

public class TestList{
    public static void main(String args[]){
        List list = new ArrayList();
        list.add("“Hello”");
        list.add("“World”");
        list.add(1, "“Learn”");
        list.add(1, "“Java”");
        printList(list);
    }
    public static void printList(List list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
//1
    }
}