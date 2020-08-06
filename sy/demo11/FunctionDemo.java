package com.sy.demo11;

import java.util.function.Function;

/**
 * @Title: FunctionDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 17:08
 */
public class FunctionDemo {


    public static int sum(String m1, String m2, Function<String,Integer> f) {
          int a = f.apply(m1);
          int b = f.apply(m2);
          return  a + b;
    }

    public static int fun(String m,Function<String,Integer> f1,Function<Integer,Integer> f2) {
        return f1.andThen(f2).apply(m);
    }


    public static void main(String[] args) {
        // 1 获取两个数字字符串的和
        // System.out.println("11"+"100");
        String a = "11";
        String b = "100";
        int r = sum(a,b,m -> Integer.parseInt(m) );
        System.out.println(r);

        // 2 求  字符串 "10"  10 倍是多少
        String msg = "10";
        int r2 = fun(msg,m -> Integer.parseInt(m),m -> m*10);
        System.out.println(r2);
    }
}
