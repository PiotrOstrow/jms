package com.github.piotrostrow.chess.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DummyEmailServiceImpl implements EmailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DummyEmailServiceImpl.class);

    @Override
    public void sendWelcomeMessage(String username, String email) {
        LOGGER.info("Dummy email service sending email to {} with greeting message for {}", email, username);
    }
}
