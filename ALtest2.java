package ArrListtest;

import java.util.ArrayList;

public class ALtest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //1.添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //2.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if ( i == list.size() - 1   ){
                System.out.print(list.get(i) );
            }else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
