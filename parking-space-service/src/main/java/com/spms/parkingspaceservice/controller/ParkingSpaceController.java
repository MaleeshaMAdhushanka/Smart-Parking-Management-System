package com.spms.parkingspaceservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parking-spaces")
public class ParkingSpaceController {

    @GetMapping("/get-parking-spaces")
    public String getParkingSpaces() {
        // This is a placeholder. In a real application, you would return a list of parking spaces.
        return "List of parking spaces";
    }
}
