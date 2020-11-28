package com.atguigu.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author darren
 * @create 2020-11-28 11:19
 * 调用处理器实现功能增强
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object tager;
    //目标对象
    public MyInvocationHandler(Object tager){
        this.tager = tager;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Integer  price = null;
        //调用目标对象的方法
        price =(Integer) method.invoke(tager, args);

        //执行方法增强
        if(price !=null){
            price = price+10;
        }
        //调用后方法增强
        System.out.println("代理类（代理商）增加10元出售");
        return price;
    }
}
