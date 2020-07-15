package com.bear.springtest2.demo.impl;

import com.bear.springtest2.demo.ActiveMQProducerService;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/14 下午11:54
 * Description:
 */

@Service
public class ActiveMQProducerServiceImpl implements ActiveMQProducerService {

    @Resource
    private JmsTemplate jmsTemplate; //JMS 模版

    @Resource(name = "queueDestination")
    Destination destination;

    @Override
    public void sendMessage(final String message) {
        //jmsTemplate.send(destination->); //lambda
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                System.out.println("send message:" + textMessage.getText());
                return textMessage;
            }
        });


    }
}
