package com.atguigu.algorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author darren
 * @create 2020-12-05 16:56
 */
public class Sort {


    /**
     * 冒泡排序
     */
    @Test
    public void test01(){
        //                    0 1 2 3 4 5 6
        int [] a = new int []{1,2,7,4,8,3,0};

        for(int i=0;i<a.length-1;i++){
            //哪些数参与比较，比多少次，
            //第一次：6个数比较，比5次
            //第二次：5个数比较，比4此
            for(int j =0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int b  = a[j];
                    a[j] =a[j+1];
                    a[j+1] =b;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    /**
     * 选择排序
     */
    @Test
    public void test02() {
        int[] a = new int[]{6, 3, 8, 9, 2, 0, 4};

        //-2的原因是剩余两个才需要选择，
        for (int i = 0; i <= a.length-2; i++) {
            //假定第一个元素为最小值
            int minIndex=i;
            for (int j = i+1; j < a.length; j++) {
                //找出最小元素的下标
                if (a[minIndex] > a[j]) {
                    minIndex=j;
                }
            }
            //交换元素
            int b = a[i];
            a[i] = a[minIndex];
            a[minIndex] = b;
        }
        System.out.println(Arrays.toString(a));
    }





















}
