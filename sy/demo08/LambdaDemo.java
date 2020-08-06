package com.sy.demo08;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Title: LambdaDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 14:39
 *
 *  分数  考过 80 分以上  就可以  得到奖励
 *
 */
public class LambdaDemo {


    public static void func01(double score) {
         if (score >= 80) {
             System.out.println("可以去游乐场找小红玩......");
         }
    }

    public static void func02(double score,LambdaFun lambdaFun) {
        if (score >= 80) {
            lambdaFun.func();
        }
    }

    public static void main(String[] args) {
       // func01(70);
        func02(70,() -> System.out.println("可以去游乐场找小红玩......"));
    }
}
