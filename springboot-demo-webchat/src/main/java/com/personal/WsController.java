package com.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.security.Principal;

/**
 * Created by mac on 05/07/2017.
 */
@Controller
public class WsController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if (principal.getName().equals("zhiyong.feng")) {
            messagingTemplate.convertAndSendToUser("zhiyong.feng", "/queue/notifications", principal.getName()
                    + " 给您发来了消息" + msg);
        } else {
            messagingTemplate.convertAndSendToUser("zhiyong.feng", "/queue/notifications", principal.getName()
                    + " 给您发来了消息" + msg);
        }
    }
}
