package cn.banyuan.demo3;

import java.util.Arrays;

public class TestMax {

    public int max(int[] list){
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            max = max >list[i]?max:list[i];
        }
        return max;
    }

    public void test(int[] list){
        list[2]=list[1];
    }

    public static void main(String[] args) {
        TestMax t = new TestMax();
        int[] arr = {1,4,5,67,23,33,12,3};
        System.out.println(t.max(arr));


        /**
         * 以下代码写着玩的，用来测试的
         */
        System.out.println(Arrays.toString(arr));
        t.test(arr);
        System.out.println(Arrays.toString(arr));//测试数组传入是否是引用
    }
}
