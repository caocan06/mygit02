package com.sy.demo09;

/**
 * @Title: MyFunctionalInterface
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 14:49
 */
@FunctionalInterface  // 标注 当前接口就是一个函数式接口  当前接口有且能只有 一个  抽象方法
public interface MyFunctionalInterface {

    void func01();


    static  void func02() {

    }

    default  void func03() {

    }

}
