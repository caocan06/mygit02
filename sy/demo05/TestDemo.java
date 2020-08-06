package com.sy.demo05;

/**
 * @Title: TestDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 13:35
 */
public class TestDemo {

    /**
     * 打开门的方法
     * @param door
     */
    public static void func(Door door) {
        door.open();
    }

    public static void main(String[] args) {
        func(new Door() {
            @Override
            public void open() {
                System.out.println("我用脚踢开门");
            }
        });
        System.out.println("---------------------------------------");

        func(()->{
            System.out.println("我用脚踢开门");
        });

        // 如果lambad 表达式  方法体  只有一行 可以将 {} 省略掉
        func(()-> System.out.println("我用脚踢开门"));
    }
}
