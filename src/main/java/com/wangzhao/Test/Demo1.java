package com.wangzhao.Test;

public class Demo1 {
    public static void main(String[] args) {
        //求5的阶乘
        System.out.println(getNum(5));
    }

    public static int getNum(int a ){

        if(a==1){
            return 1;
        }
        return a*getNum(a-1);



    }
}
