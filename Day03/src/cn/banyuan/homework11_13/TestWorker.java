package cn.banyuan.homework11_13;

import cn.banyuan.homework12.Address;

public class TestWorker {
    public static void main(String[] args) {
        Worker aaa = new Worker("zhangsan",25,2500);
        Address addr = new Address("北京市海淀区清华园1号", "100084");
        aaa.addr=addr;
        System.out.println(aaa);


    }
}
