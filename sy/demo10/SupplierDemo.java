package com.sy.demo10;

import java.util.function.Supplier;

/**
 * @Title: SupplierDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 15:15
 */
public class SupplierDemo {

    public static String func01(Supplier<String> supplier) {
        return  supplier.get();
    }


    public static double func02(Supplier<Double> supplier) {
        return  supplier.get();
    }


    public static void main(String[] args) {
        // 获取一个字符串
        String  result = func01(() -> "hello world!");
        System.out.println(result);


        // 案例 获取数组中的最大值
        double[] arr = null;

        double  max =  func02(() -> {
              double maxValue = 0;
              if(arr == null) {
                  return 0.0;
              }

              if(arr.length == 0) {
                  return  0.0;
              }

              // 假定 数组的最大值就是第一个元素
              maxValue =  arr[0];

              for(int i = 1;i<arr.length;i++) {
                  if(arr[i] > maxValue)
                      maxValue =  arr[i];
              }

              return  maxValue;

        });

        System.out.println(max);



    }
}
