package com.ASSR.AiBot.Controller;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.prompt.Prompt;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class AiController {
    private final ChatClient chatClient;

    public AiController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }


    @GetMapping("/hi")
    public String hello() {
        return "Hello, World!";
    }
    @GetMapping("/hello")
    public Map<String,String> aiResponse(@RequestParam String Question, @RequestParam String Mode){
        System.out.println("qwertyuiop");
    String message=Question+" and answer with "+Mode+" accent";
        System.out.println(message);
        String Answer=chatClient.generate(message);
        System.out.println(Answer);
        return Map.of("generation", Answer);
    }
    @GetMapping("/ai/generate")
    public String generate(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        Prompt prompt=new Prompt(message);
//        return Map.of("generation", chatClient.generate(prompt));
        return chatClient.generate(prompt).toString();
    }

}
