package ArrListtest;

import java.util.ArrayList;

public class ALtest1 {
    public static void main(String[] args) {

        //1.创建集合的对象
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("点赞了吗？");
        list.add("收藏了吗？");
        list.add("转发了了吗？");
        list.add("看到我了吗？");

        //3.遍历集合
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
