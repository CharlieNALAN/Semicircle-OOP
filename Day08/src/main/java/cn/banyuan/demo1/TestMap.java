package cn.banyuan.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("aaa","111");
        map.put("bbb","222");
        map.put("ccc","333");

        System.out.println(map.containsKey("aaa"));


        Set set = map.keySet();
        for(Object s:set){
            String str = (String) map.get(s);
            System.out.println(s+"   "+str);
        }

        System.out.println(map.toString());

        System.out.println("------------------------");
        Iterator it = set.iterator();
        while (it.hasNext()){
            String key =(String) it.next();
            String value = (String) map.get(key);
            System.out.println(key+"   "+value);
        }
    }
}
