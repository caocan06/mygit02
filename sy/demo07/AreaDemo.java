package com.sy.demo07;

/**
 * @Title: AreaDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 14:27
 */
public class AreaDemo {

    public static double func(double r,Area area) {
        return  area.getArea(r);
    }

    public static void main(String[] args) {
        double r = 2.0;

        // 1 原始的写法
//        double result = func(r, new Area() {
//            @Override
//            public double getArea(double r) {
//                return Math.PI*r*r;
//            }
//        });

        // 2  Lambda 的写法
//        double result = func(r,(double a) -> {
//              return Math.PI*a*a;
//        });


        // 3 lambda 简化写法
//        double result = func(r,(a) -> Math.PI*a*a);

        // 4  lambda 最简化写法 如果lambda 方法中  形式参数只有一个  那么 () 也可以省略
        double result = func(r,a-> Math.PI*a*a);
        System.out.println(result);
    }
}
