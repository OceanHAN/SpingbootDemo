package com.example.demo.util;


import java.util.concurrent.locks.ReentrantLock;

/**
 * @author OceansHan
 * @date 2021/2/3 15:09
 * 测试LOCK锁
 */
public class TestThreadLock {
    public static void main(String[] args) {
        TestLock testLock = new TestLock();
        new Thread(testLock,"小明").start();
        new Thread(testLock,"小红").start();
        new Thread(testLock,"小慧").start();
    }


}
/**
 * @author OceanHan
 * @date 2021/2/3 15:22
 * @return
 */
class TestLock implements Runnable{
    int ticketNums = 10;
   /**
    *定义lock锁
    */
   ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            //加locks锁
            try {
                lock.lock();
            }finally {
                lock.unlock();
            }
            if(ticketNums>0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+ticketNums--);
            }else {
                break;
            }
        }

    }
}
