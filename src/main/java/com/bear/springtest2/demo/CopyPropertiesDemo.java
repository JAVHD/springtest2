package com.bear.springtest2.demo;

import com.bear.springtest2.bean.Animal;
import com.bear.springtest2.bean.Person;
import org.springframework.beans.BeanUtils;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/10 下午2:55
 * Description: SpringFramework beans BeansUtils.copyProperties
 */

public class CopyPropertiesDemo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setName("bangdu");
        animal.setAge(2);
        animal.setFood("fish");

        Person person = new Person();

        BeanUtils.copyProperties(animal, person);

        System.out.println(person);
    }

}
