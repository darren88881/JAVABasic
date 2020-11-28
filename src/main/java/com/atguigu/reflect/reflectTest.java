package com.atguigu.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author darren
 * @create 2020-11-28 18:09
 */
public class reflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //获取配置文件
        Properties pro = new Properties();
        InputStream resourceAsStream = reflectTest.class.getClassLoader().getResourceAsStream("pro.properties");
        pro.load(resourceAsStream);

        //获取配置文件中的值
        String className = pro.getProperty("className");
        String classFunction = pro.getProperty("classFunction");

        //加载类到内存
        Class<?> aClass = Class.forName(className);
        //创建对象
        Object o = aClass.newInstance();

        //获取方法
        Method method = aClass.getMethod(classFunction);
        //执行方法
        Object invoke = method.invoke(o);
        System.out.println(invoke);


    }
}
