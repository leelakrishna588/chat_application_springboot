package com.stackroute.pocsocketconnection.controller;

import com.stackroute.pocsocketconnection.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/message")
//    @SendTo("/topic/message")
    private void sendMessage(Message message) {
        messagingTemplate.convertAndSendToUser(message.getToUser(), "/queue/message", message);
    }
}
