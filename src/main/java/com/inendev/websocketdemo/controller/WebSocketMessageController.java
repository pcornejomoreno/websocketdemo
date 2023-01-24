package com.inendev.websocketdemo.controller;

import com.inendev.websocketdemo.config.MessageDto;
import com.inendev.websocketdemo.config.OutputMessageDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WebSocketMessageController {
    private final Logger logger = LoggerFactory.getLogger(WebSocketMessageController.class);

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessageDto send(MessageDto message) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        logger.info(message.toString());
        return new OutputMessageDto(message.getFrom(), message.getText(), time);
    }
}
