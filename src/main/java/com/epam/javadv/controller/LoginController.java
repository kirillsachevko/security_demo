package com.epam.javadv.controller;

import com.epam.javadv.handler.LoginAttemptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class LoginController {

    private final LoginAttemptService attemptService;

    public LoginController(LoginAttemptService attemptService) {
        this.attemptService = attemptService;
    }

    @RequestMapping("/login")
    public String login(Principal principal) {
        if (attemptService.isBlocked(principal.getName())) {
            return "error";
        }
        return "login";
    }
}
