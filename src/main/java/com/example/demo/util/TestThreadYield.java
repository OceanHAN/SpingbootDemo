package com.example.demo.util;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author OceansHan
 * @date 2021/2/2 15:12
 * 线程礼让练习
 * 礼让不一定成功，看CPU心情
 */
public class TestThreadYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();
    }
}
class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}
