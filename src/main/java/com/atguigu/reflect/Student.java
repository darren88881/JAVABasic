package com.atguigu.reflect;

/**
 * @author darren
 * @create 2020-11-28 18:07
 */
public class Student {

    private String name;
    private String six;

    public Student() {
        super();
    }

    public Student(String name, String six) {
        this.name = name;
        this.six = six;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", six='" + six + '\'' +
                '}';
    }

    public String eat(){
        System.out.println("学生吃饭的方法");

        return "1";
    }
}
