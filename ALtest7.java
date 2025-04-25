package ArrListtest;

import java.util.ArrayList;

public class ALtest7 {
    public static void main(String[] args) {

        //1.创建集合的对象
        ArrayList<Phone> list = new ArrayList<>();

        //2.创建手机对象并添加到集合当中
        Phone p1 = new Phone("小米", 1999);
        Phone p2 = new Phone("苹果", 8999);
        Phone p3 = new Phone("锤子", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        //调用方法
        ArrayList<Phone> phoneInfo = getPhoneInfo(list);

        for (int i = 0; i < phoneInfo.size(); i++) {
            Phone p = phoneInfo.get(i);
            System.out.println(p.getBrand() + ", " + p.getPrice());
        }


    }
    public  static  ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义一个集合存储手机信息
        ArrayList<Phone> resultArrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price <= 3000){
                resultArrayList.add(p);
            }
        }
        return resultArrayList;
    }
}
