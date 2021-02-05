package com.example.demo.util;

/**
 * @author OceansHan
 * @date 2021/2/1 9:42
 * 多线程demo1
 * 创建线程方式:继承Thread类,然后重写run()方法,调用start()开启线程
 * 总结:线程开启不一定立即执行,由cpu调度执行
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("run线程=="+i);
        }
    }

    public static void main(String[] args) {
        //main线程,主线程

        //创建一个线程对象
        Thread1 thread1 = new Thread1();
        //调用start开启线程
        thread1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程=="+i);
        }
    }
}
