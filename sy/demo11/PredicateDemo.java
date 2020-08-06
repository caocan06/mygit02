package com.sy.demo11;

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
public class PredicateDemo {


    public static  boolean func01(String msg, Predicate<String> p) {
        return  p.test(msg);
    }

    public static  boolean func02(String msg,Predicate<String> p1,Predicate<String> p2,Predicate<String> p3) {
        return p1.and(p2).and(p3).test(msg);
    }




    public static void main(String[] args) {
          // 1  校验一个字符串  字符串的长度 > 5  返回真 否则 返回假
           String msg = "上元教育";
           boolean r = func01(msg,m -> m.length() > 5);
            System.out.println(r);
            // 2  判断 字符串  以java 开头   并且  web 结束 并且 长度 大于 10
            String msg2 = "java 上元it web1";
        boolean r2= func02(msg2,m -> m.startsWith("java"), m -> m.endsWith("web"), m -> m.length() > 10);
        System.out.println(r2);

    }
}
