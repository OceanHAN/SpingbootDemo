package com.example.demo.util;

/**
 * @author OceansHan
 * @date 2021/2/2 11:00
 * 线程停止练习
 * 1.建议线程正常停止,利用次数，不建议死循环
 * 2.建议使用标志位
 * 3.不要使用stop或者destroy等过时的方法或者JDK不建议使用的方法
 *
 */
public class TestThreadStop implements Runnable {
    /**1.设置一个标志位*/
    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("线程==>"+i);
        }
    }
    /**
     * @author OceanHan
     * @date 2021/2/2 11:04
     * @return
     * 设置一个公开的方法,转换标志位
     */
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        TestThreadStop threadStop = new TestThreadStop();
        new Thread(threadStop).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i);
            if(i==600){
                //切换标志位，停止线程
                threadStop.stop();
                System.out.println("线程停止");
            }
        }
    }
}
