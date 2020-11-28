package com.atguigu.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author darren
 * @create 2020-11-28 11:27
 */
public class ProxyTest {

    public static void main(String[] args) {
        //目标对象
        UsbSell usbKingFactory = new UsbKingFactory();


        //创建调用处理器对象
        InvocationHandler invocationHandler  = new MyInvocationHandler(usbKingFactory);

        //创建代理对象
        UsbSell proxyInstance = (UsbSell)Proxy.newProxyInstance(usbKingFactory.getClass().getClassLoader(), usbKingFactory.getClass().getInterfaces(), invocationHandler);

        //通过代理对象执行方法
        Integer sell = proxyInstance.sell();
        System.out.println(sell);
    }
}
