package com.multithreading.thread;

import org.junit.jupiter.api.Test;

/**
 * 使用常见命令分析线程
 *
 * cd C:\Windows\System32\cmd.exe
 *
 * jmc.exe
 * jvisualvm.exe
 *
 * @author darren
 * @create 2021-06-20 12:37
 */
public class CommandAnalysisThread {

    /**
     * 测试方法模板
     */
    @Test
    public void test00() {

    }

    /**
     * 匿名内部类创建线程
     */
    @Test
    public void test01(){
        new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("AAAA");
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    /**
     * lambda表达式创建线程
     */
    @Test
    public void test02(){
        new Thread(() -> {
            System.out.println("BBBB");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
    }

    /**
     * 使用常见命令分析线程
     */
    @Test
    public void test03(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(() -> {
                    System.out.println("AAAAAAA");

            },"A"+i).start();
        }
    }
    
}
