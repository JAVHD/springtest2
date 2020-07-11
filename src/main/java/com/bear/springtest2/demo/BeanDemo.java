package com.bear.springtest2.demo;

import com.bear.springtest2.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/11 上午11:55
 * Description:
 */

public class BeanDemo {

    public static void main(String[] args) {

        //加载配置文件
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = classPathXmlApplicationContext;

//        //获取bean对象
//        Person person = (Person) applicationContext.getBean("person"); //根据bean id 获取
//
//        person.setAge(18);
//        person.setName("bear");
//
//        System.out.println(person.toString());

    }
}
