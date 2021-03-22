package com.atguigu.classloader;

/**
 * @author darren
 * @create 2021-01-10 8:39
 * 获取类加载器
 */
public class GetClassLoader {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //获取扩展类加载器
        ClassLoader loaderParent = systemClassLoader.getParent();
        //获取根加载器
        ClassLoader parent = loaderParent.getParent();
        System.out.println(systemClassLoader);
        System.out.println(loaderParent);
        System.out.println(parent);

    }
}
