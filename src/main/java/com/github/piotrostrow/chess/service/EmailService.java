package com.github.piotrostrow.chess.service;

public interface EmailService {

    void sendWelcomeMessage(String username, String email);
}
