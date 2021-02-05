package com.example.demo.util;

/**
 * @author OceansHan
 * @date 2021/2/2 9:18
 * lamda练习
 */
public class TestLambda {

    public static void main(String[] args) {


        //匿名内部类实现
        /*ILike like = new ILike() {
            @Override
            public void lambda(int a) {
                System.out.println("I love lambda ==>"+a);
            }
        };*/

        //用lambda简化
        ILike like = (int a) -> {
                System.out.println("I love lambda ==>"+a);
            };
        like.lambda(520);
        };

    }
/**
 *1、定义一个函数式接口
 */
interface ILike{
    void lambda(int a);
}


