package com.atguigu.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author darren
 * @create 2021-01-10 9:37
 */
public class Annotaction1 {
    public static void main(String [] args) throws ClassNotFoundException, NoSuchFieldException {
        Class forName = Class.forName("com.atguigu.annotation.Student");
        //通过反射获得注解
        Annotation[] annotations = forName.getAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(annotation);
        }
        //获取注解上的值
        MyTable myTable =  (MyTable)forName.getAnnotation(MyTable.class);
        String value = myTable.value();
        System.out.println(value);

        //获取属性上的注解
        Field age = forName.getDeclaredField("age");
        MyField myField = age.getAnnotation(MyField.class);
        System.out.println("conlumnName:"+myField.columnName());
        System.out.println("type:"+myField.type());
        System.out.println("length:"+myField.length());


    }
}
@MyTable("db_student")
class Student{
    @MyField(columnName="db_id",type="int",length = 10)
    private int age;
    private String name;

}

/**
 * 类名的注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  MyTable{
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyField{
    String columnName();
    String type();
    int length();
}