package com.bear.springtest2.demo.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/16 下午5:32
 * Description:
 */

public class ConsumerMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        //message.getM

        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("消费消息：" + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

        //System.out.println(textMessage.getText());

    }
}
