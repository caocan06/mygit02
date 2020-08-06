package com.sy.demo10;

import javax.sound.midi.Soundbank;
import java.util.function.Consumer;

/**
 * @Title: ConsumerDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 15:43
 */
public class ConsumerDemo {

    public static void func01(String msg, Consumer<String> consumer) {
        consumer.accept(msg);
    }


    public static void func02(String msg, Consumer<String> c1,Consumer<String> c2) {
//        c1.accept(msg);
//        c2.accept(msg);
        // 将两个 Consumer 处理器 进行一个链式编程
        c1.andThen(c2).accept(msg);
    }


    public static void  func03(String[] arr,Consumer<String> c) {
         for (String str : arr) {
             c.accept(str);
         }
    }







    public static void main(String[] args) {
        String msg = "上元教育";
        func01(msg,(m)-> System.out.println(m));

        // 需求 将一个字符串  全部转为大写  再全部转为小写
        msg = "Hello World!";
        func02(msg,m -> System.out.println(m.toUpperCase()),m -> System.out.println(m.toLowerCase()));

        // 格式化打印输出
        String[] array = { "小明,男,100", "小红,女,80", "韩梅,女,80" , "吉姆,男,60"};
      //  func03(array,str -> System.out.println("姓名:"+str.split(",")[0]+"\t性别:"+str.split(",")[1]+"\t年龄："+str.split(",")[2]) );
       func03(array,str -> {
           String[] arr = str.split(",");
           System.out.println("姓名:"+arr[0]+"\t性别:"+arr[1]+"\t年龄："+arr[2]);
       });
    }
}
