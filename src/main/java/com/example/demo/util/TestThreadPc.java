package com.example.demo.util;

/**
 * @author OceansHan
 * @date 2021/2/3 15:47
 * 生产者消费者模型--->利用缓冲区解决：管程法
 * 生产者，消费者，产品，缓冲区
 */
public class TestThreadPc {

}
/**
 * 生产者
 */
class Producer extends Thread{

}

/**
 * 消费者
 */
class Consumer extends Thread{

}

/**
 * 产品
 */

class Chicken{
    /**
     *产品编号
     */
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}
/**
 *  缓冲区
 */
class SynContainer{
    //需要一个容器大小
    Chicken[] chickens = new Chicken[10];
    //

    //生产者放入产品
    public synchronized void push(Chicken chicken){
        //如果容器满了,需要等待消费者消费

        //如果没有满,我们就需要丢入

    }

    //消费者消费产品


}