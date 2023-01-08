package com.kleistit.farmapi.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbtModule extends AbstractModule {
    @Override
    protected void configure() {

    }



    @Singleton
    @Provides
    Connection rabbitConnectionSource(RabbitConfig rabbitConfig) throws IOException, TimeoutException {
        return new RabbitSource(rabbitConfig).connectionFactory();
    }
}
