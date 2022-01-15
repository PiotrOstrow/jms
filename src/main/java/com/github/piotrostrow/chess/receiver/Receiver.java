package com.github.piotrostrow.chess.receiver;

import com.github.piotrostrow.chess.jms.message.NewUserMessage;
import com.github.piotrostrow.chess.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);
    private static final String QUEUE = "c_queue";

    private final EmailService emailService;

    public Receiver(EmailService emailService) {
        this.emailService = emailService;
    }

    @JmsListener(destination = QUEUE)
    public void listen(@Payload NewUserMessage message) {
        LOGGER.info("Received message, new user created: {}", message.getUsername());
        emailService.sendWelcomeMessage(message.getUsername(), message.getEmail());
    }
}
