package com.chatbot.whatsapp_bot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

        public String getReply(String msg) {
            if (msg == null) return "Invalid message";

            msg = msg.toLowerCase();

            switch (msg) {
                case "hi":
                    return "Hello";
                case "bye":
                    return "Goodbye";
                default:
                    return "I don't understand";
            }
        }

}
