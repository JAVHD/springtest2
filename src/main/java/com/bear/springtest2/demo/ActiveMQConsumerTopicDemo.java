package com.bear.springtest2.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/14 下午2:06
 * Description: 消费消息
 */

public class ActiveMQConsumerTopicDemo {
    public static void main(String[] args) { //ClassPathXmlApplicationContext

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumerTopic.xml");

    }
}
