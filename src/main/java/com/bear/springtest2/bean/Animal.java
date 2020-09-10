package com.bear.springtest2.bean;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/10 下午2:57
 * Description:
 */

public class Animal {

    private String name;

    private Integer age;

    private String food;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
