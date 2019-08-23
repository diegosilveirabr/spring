package com.diegosilveirabr.boot.messengerconsumer;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@Component
public class QueueProcessor {
    private final ObjectMapper objectMapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(QueueProcessor.class);

    @Autowired
    public QueueProcessor(ObjectMapper objectMapper){
        super();
        this.objectMapper = objectMapper;
    }

    public void receiveMessage(String messageJson){
        LOGGER.info("Message Received");
        try{
            Message message = this.objectMapper.readValue(messageJson, Message.class);
            LOGGER.info("Message id " + message.getId());
        }catch(IOException exc){
            LOGGER.error("Exception caught", exc);
        }
    }
}