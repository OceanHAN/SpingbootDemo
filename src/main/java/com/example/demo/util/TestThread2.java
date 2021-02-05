package com.example.demo.util;

/**
 * @author OceansHan
 * @date 2021/2/1 10:13
 * 创建线程方式2
 * 实现Runnable接口,重写run方法，执行线程需要丢入Runnable接口实现类,调用start方法
 */
public class TestThread2 implements Runnable {
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("run方法=="+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口的的实现类
        TestThread2 testThread2 = new TestThread2();
        //创建线程对象,通过线程对象开启我们的线程
        new Thread(testThread2).start();
        for (int i = 0; i < 800; i++) {
            System.out.println("我是主线程=="+i);
        }
    }
}
