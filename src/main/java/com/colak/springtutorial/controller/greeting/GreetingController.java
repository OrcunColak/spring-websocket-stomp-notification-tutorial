package com.colak.springtutorial.controller.greeting;

import com.colak.springtutorial.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetingController {

    private final NotificationService notificationService;

    // http://localhost:8080/greet?name=John
    @GetMapping("/greet")
    public void greet(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        notificationService.sendNotification("Hello, " + name + "!");
    }

}
