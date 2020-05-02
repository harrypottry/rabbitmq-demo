package com.test.consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @Author: harrypotter
 * @Description: rabbitmq测试
 */
public class FourthConsumer implements MessageListener {
    private Logger logger = LoggerFactory.getLogger(FourthConsumer.class);

    public void onMessage(Message message) {
        logger.info("The fourth consumer received message : " + message);
    }
}

