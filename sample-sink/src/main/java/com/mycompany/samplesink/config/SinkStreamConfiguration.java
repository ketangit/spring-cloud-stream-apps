package com.mycompany.samplesink.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.List;

@Configuration
@EnableBinding(Sink.class)
public class SinkStreamConfiguration {
    private final Logger logger = LoggerFactory.getLogger(SinkStreamConfiguration.class);

    @StreamListener(Sink.INPUT)
    public void process(Message<List<String>> message) {
        List<String> data = message.getPayload();
        logger.info("Message received size:{} ", data.size());
    }
}
