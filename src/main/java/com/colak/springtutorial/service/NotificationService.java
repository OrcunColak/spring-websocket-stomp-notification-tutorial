package com.colak.springtutorial.service;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final SimpMessagingTemplate messagingTemplate;

    public void sendNotification(String message) {
        // Send to WebSocket clients
        messagingTemplate.convertAndSend("/topic/notifications", message);
    }
}
