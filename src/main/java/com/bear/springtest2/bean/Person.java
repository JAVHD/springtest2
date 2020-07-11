package com.bear.springtest2.bean;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/11 上午11:50
 * Description:
 */

public class Person {

    public Person() {
        System.out.println("bean 注册");
    }

    private String name;
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

}
