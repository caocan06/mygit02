package com.sy.demo04;

/**
 * @Title: ThreadDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 11:20
 */
public class ThreadDemo {


    public static void main(String[] args) {
        // 创建一个线程
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("启动这个线程.......");
//            }
//        }).start();


        new Thread(()->{
            System.out.println("启动这个线程.......");
        }).start();
    }
}
