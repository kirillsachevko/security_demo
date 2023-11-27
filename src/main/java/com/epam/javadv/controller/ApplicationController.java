package com.epam.javadv.controller;

import com.epam.javadv.handler.LoginAttemptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    private final LoginAttemptService attemptService;

    public ApplicationController(LoginAttemptService attemptService) {
        this.attemptService = attemptService;
    }

    @GetMapping("/info")
    public String getInfo() {
        return "MVC application";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "About MVC";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Admin access";
    }

    @GetMapping("/blockedUsers")
    public List<String> getBlockedUsers() {
        return attemptService.getBlockedUsers();
    }


}
