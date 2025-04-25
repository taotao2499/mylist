package ArrListtest;

import java.util.ArrayList;
import java.util.Scanner;

public class ALtest5 {
    public static void main(String[] args) {

        //1.创建集合的对象
        ArrayList<ALtest4Student> list = new ArrayList<>();

        //键盘录入学生信息并添加到集合当中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            ALtest4Student s = new ALtest4Student();
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);

            list.add(s);

        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            ALtest4Student s = list.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
