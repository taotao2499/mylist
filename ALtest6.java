package ArrListtest;

import java.util.ArrayList;

public class ALtest6 {
    public static void main(String[] args) {
        /*需求：
1，main方法中定义一个集合，存入三个用户对象。
用户属性为：id，username，password
2，要求：定义一个方法，根据id查找对应的用户信息。
如果存在，返回true
如果不存在，返回false*/

        //1.创建集合的对象
        ArrayList<User> list = new ArrayList<>();
        //创建三个用户对象
        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "12345678");
        User u3 = new User("heima003", "wangwu", "12345699");
        //把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调用方法
        boolean flag = getUser(list, "heima001");
        System.out.println(flag);


    }
    public static boolean getUser(ArrayList<User> list, String id) {
        //遍历集合，获取每一个用户对象
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                return true;
            }
        }
        return false;
    }
}
