package com.spms.vehicleservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    @GetMapping("/vehicle")
    public String home(){
        return "Welcome to Vehicle Service";
    }
}
