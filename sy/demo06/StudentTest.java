package com.sy.demo06;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Title: StudentTest
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 13:42
 */

public class StudentTest {

    public static void main(String[] args) {
        // 1  实例化四名学生  学生存储到一个班级
        Student[] stus = new  Student[]{
                new Student("小明",20),
                new Student("小红",16),
                new Student("韩梅",18),
                new Student("吉姆",17)
        };

        // 2  为学生进行排序  按照年龄排序

        // 2.1  传统的写法
//        Arrays.sort(stus, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // 2.2 lambda 表达式的写法  【有参数  有返回值 】
//        Arrays.sort(stus,(Student o1, Student o2) -> {
//            return o1.getAge() - o2.getAge();
//        });

        // 2.3  Lambda  表达式  可以进行推导
//        Arrays.sort(stus,(o1, o2) -> {
//            return o1.getAge() - o2.getAge();
//        });
        // 2.4 Lambda 表达式 方法体只有返回值这一行  那么 {} 和  return 都可以省略【推荐】
        Arrays.sort(stus,(o1, o2) -> o1.getAge() - o2.getAge());

        // 3.5  不能省略的情况 方法体存在多行代码
//        Arrays.sort(stus,(o1, o2) -> {
//            if(o1.getAge() > o2.getAge()) {
//                return 1;
//            }else if(o1.getAge() < o2.getAge()){
//                return -1;
//            } else {
//                return 0;
//            }
//        });

        // 3  打印学生
        System.out.println(Arrays.toString(stus));
    }
}
