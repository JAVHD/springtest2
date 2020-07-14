package com.bear.springtest2.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/14 下午2:06
 * Description: 生产者服务
 */

public class ActiveMQProducerDemo {
    public static void main(String[] args) { //ClassPathXmlApplicationContext

        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean
        ActiveMQProducerService activeMQProducerService = applicationContext.getBean(ActiveMQProducerService.class);

        //生产者发送消息
        for (int i = 0; i < 100; i++) {
            activeMQProducerService.sendMessage("my first ActiveMQ message :" + i);
        }

    }
}
