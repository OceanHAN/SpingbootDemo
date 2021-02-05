package com.example.demo.util;

/**
 * @author OceansHan
 * @date 2021/2/2 10:34
 * 静态代理
 * 总结：
 * 真实对象和代理对象都要实现同一个接口
 * 代理对象要代理真实角色
 * 好处：
 * 代理对象可以做很多真实对象做不了的事情
 * 真实对象专注做自己的事情
 *
 */
public class TestThread7 {
    public static void main(String[] args) {
        You you = new You();
        //多线程 也是代理关系
        new Thread(() ->{
            System.out.println("我爱你");
        }).start();
         new Wedding(you).HappyMarry();

    }
}

/**
 * 1.定义一个函数式接口
 */
interface Marry {
    void HappyMarry();
}

//真实角色
class You implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("我要结婚了");
    }
}

//代理角色
class Wedding implements  Marry{
    private Marry target;

    public Wedding(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        Begin();
        this.target.HappyMarry();//真实对象
        End();
    }

    private void Begin(){
        System.out.println("代理机构布置现场");
    }
    private void End(){
        System.out.println("向我收取尾款");
    }
}