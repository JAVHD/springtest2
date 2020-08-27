package com.bear.springtest2.demo;

import com.bear.springtest2.bean.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/27 下午3:42
 * Description: xml bean注入与注解注入对比
 */

public class BeanInjectXmlCompareAnnotationDefineDemo {

//    @Autowired
//    private Man man;

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanDefine.xml");
        Man man = (Man) applicationContext.getBean("man");
        System.out.println(man.getDistrict());
        System.out.println(man.getHeight());
    }

}
