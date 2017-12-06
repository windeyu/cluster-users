package com.x.users.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private String profile;

    @Value("${windeyu.deployment.profile}")
    void setProfileName(String profileName) {
        profile = profileName;
    }

    @RequestMapping("/test")
    public String test() {
        return "Current active profile: " + profile;
    }
}
