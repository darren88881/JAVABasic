package com.atguigu.likou;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author darren
 * @create 2022-06-27 20:14
 */
public class AQuJinSiZhi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            HashSet<Integer> hashSet = new HashSet<>();
            int i = scanner.nextInt();
            while (i != 0) {
                int a = i % 10;
                if (hashSet.add(a)) {
                    System.out.print(a);
                }
                i /= 10;
            }
            System.out.println();
        }
    }

    /**
     * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
     * 如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整。
     *
     */
    public void test01(){
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println((int)(number + 0.5));
    }

    /**
     * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
     * 保证输入的整数最后一位不是 0 。
     */
    public static void test02(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            // 使用HashSet来判断是否是不重复的
            HashSet<Integer> hs = new HashSet<>();
            int target = sc.nextInt();// 获取代求解的值
            while(target != 0){ // 求解每位上面的整数
                int temp = target % 10;
                if(hs.add(temp)) // 如果能加入，就是说明没有重复
                    System.out.print(temp);
                target /= 10;// 除10能去掉最右边的数字
            }
            System.out.println();
        }
    }
}
