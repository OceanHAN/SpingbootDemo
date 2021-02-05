package com.example.demo.util;

/**
 * @author OceansHan
 * @date 2021/2/1 10:34
 * 模拟龟兔赛跑
 */
public class TestThread5 implements Runnable{
    //胜利者
    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            //模拟兔子休息
            if(Thread.currentThread().getName().equals("兔子") && i%10 ==0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //判断比赛是否结束
            boolean flag = gameOver(i);
            //比赛结束，结束程序
            if(flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"==>跑了"+i+"米");
        }
    }
    /**判断是否完成比赛*/
    private boolean gameOver(int steps){
        //已经存在胜利者
        if (winner!=null){
            return true;
        }else {
            if(steps >= 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TestThread5 testThread5 = new TestThread5();
        new Thread(testThread5,"兔子").start();
        new Thread(testThread5,"乌龟").start();
    }

}
