//package com.ASSR.AiBot.Service;
//
//
//
//import org.springframework.ai.prompt.Prompt;
//import org.springframework.ai.prompt.PromptTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
//@Service
//public class AiServiceImpl implements AiService {
//
//    private final AiClient aiClient;
//
//    public AiServiceImpl(AiClient aiClient) {
//        this.aiClient = aiClient;
//    }
//
//    @Override
//    public String getResponse(String Question, String Mode) {
//        PromptTemplate promptTemplate = new PromptTemplate("{Question} and answer with {Mode} accent");
//
//        Prompt prompt = promptTemplate.create(Map.of("Question", Question, "Mode", Mode));
//
//        Generation generation= aiClient.generate(prompt).getGeneration();
//        return generation.getText();
//
//    }
//
//}
