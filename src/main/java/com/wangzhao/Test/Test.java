package com.wangzhao.Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(getNum(1,2));
    }
    public static String getNum(int... i){
        return i[0]+i[1]+"";
    }
}
