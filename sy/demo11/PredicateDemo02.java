package com.sy.demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Title: PredicateDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 16:21
 *
 * 判断的接口函数
 */
public class PredicateDemo02 {

    public static  List<Student> filter(List<Student> stus,Predicate<Student> p1,Predicate<Student> p2) {
        List<Student> newList = new ArrayList<>();
        for (Student stu : stus) {
            boolean b = p1.or(p2.negate()).test(stu);
            if(b) {
                newList.add(stu);
            }
        }
        return  newList;
    }


    public static void main(String[] args) {
        // 需求: 获取年龄大于18 岁 或者成绩不大于60 的学生信息   >
        List<Student> stus = new ArrayList<>();
        stus.add(new Student("小明",19,59.0));  // 存在
        stus.add(new Student("小红",17,59.0));
        stus.add(new Student("韩梅",19,61.0));  //
        stus.add(new Student("吉姆",16,61.0));   //过滤掉

        List<Student> newStus = filter(stus,s -> s.getAge() > 18,s -> s.getScore() > 60);
        System.out.println(newStus);

    }
}
