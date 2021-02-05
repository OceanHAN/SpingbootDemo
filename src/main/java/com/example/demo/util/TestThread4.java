package com.example.demo.util;

import javax.naming.Name;

/**
 * @author OceansHan
 * @date 2021/2/1 10:24
 * 买火车票的例子
 * 问题：多线程操作同一个资源的情况下,线程不安全,数据紊乱
 */
public class TestThread4 implements Runnable {
    //票数
    private int tickNums = 10;
    @Override
    public void run() {
        while (true){
            if(tickNums<=0){
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thread.currentThread().getName() 获取线程名称
            System.out.println(Thread.currentThread().getName()+"==>拿到了第"+tickNums--+"张票");
        }
    }

    public static void main(String[] args) {
        TestThread4 ticket = new TestThread4();
        new Thread(ticket, "小明").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛").start();
    }
}
