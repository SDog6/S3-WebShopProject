package project.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import project.Models.Greeting;
import project.Models.HelloMessage;


@Controller
public class ChatController {
    @MessageMapping("/topics")
    @SendTo("/topic/chat")
    public Greeting greeting(HelloMessage message) throws Exception {
        return new Greeting(HtmlUtils.htmlEscape(message.getUsername() + " : " +message.getName()) );
    }
}
