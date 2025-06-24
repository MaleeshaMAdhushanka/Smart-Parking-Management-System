package com.spms.userservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @GetMapping("/getusers")
    public String getUsers() {
        // This is a placeholder for the actual implementation
        return "List of users will be returned here";
    }

}
