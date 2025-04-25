package ArrListtest;

import java.util.ArrayList;

public class ALtest4 {
    public static void main(String[] args) {
        //1.创建集合的对象
        ArrayList<ALtest4Student> list = new ArrayList<>();
        //2.添加元素
        ALtest4Student s1 = new ALtest4Student("张三", 18);
        ALtest4Student s2 = new ALtest4Student("李四", 19);
        ALtest4Student s3 = new ALtest4Student("王五", 20);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //3.遍历集合
        for (int i = 0; i < list.size(); i++) {
            ALtest4Student s = list.get(i);
            System.out.println(s.getName() + ", " + s.getAge());

        }


    }
}
