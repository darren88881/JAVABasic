package com.multithreading.thread;

import org.junit.jupiter.api.Test;

/**
 *
 * 获取堆栈跟踪
 *
 * @author darren
 * @create 2021-06-20 14:33
 */
public class ThreadStackTrace {

    /**
     * 测试方法模板
     */
    @Test
    public void test00() {

    }

    /**
     * 测试方法模板
     */
    @Test
    public void test01() {
        a();
    }

    public void a() {
        b();

    }
    public void b() {
        c();
    }
    public void c() {
        d();
    }
    public void d() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for(StackTraceElement element:stackTrace){
            System.out.println(
                            "ClassName:"+element.getClassName()+"\n"+
                            "FileName:"+element.getFileName()+"\n"+
                            "MethodName:"+element.getMethodName()+"\n"+
                            "LineNumber:"+element.getLineNumber()
            );
            System.out.println("-----------------------------------------");
        }

    }
}
