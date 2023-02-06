package com.example.RensoftSocketsImplementation.Controller;

import com.example.RensoftSocketsImplementation.Models.GreetingResponseModel;
import com.example.RensoftSocketsImplementation.Models.HelloModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingResponseModel greeting(HelloModel message) throws Exception{
        Thread.sleep(100); // simulate delay
        return new GreetingResponseModel(
                "Bonjour, "+message.getName()
//                message.getName()
//                "Bonjour, " + HtmlUtils.htmlEscape(
//                        message.getName()
//                )
        );

    }

}
