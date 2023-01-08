package com.kleistit.farmapi.modules;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ExceptionHandler;
import com.rabbitmq.client.impl.AMQImpl;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitSource {


    private  ConnectionFactory connectionFactory;
    public RabbitSource(RabbitConfig rabbitConfig){
      setConnectionFactory(rabbitConfig);

    }

    private void setConnectionFactory(RabbitConfig rabbitConfig) {
        connectionFactory = new ConnectionFactory();
        connectionFactory.setHost(rabbitConfig.getHost());
        connectionFactory.setPort(rabbitConfig.getPort());
    }


    public Connection connectionFactory() throws  IOException, TimeoutException {
       return this.connectionFactory.newConnection();
    }


}
