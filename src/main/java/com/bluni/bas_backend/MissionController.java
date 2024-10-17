package com.bluni.bas_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MissionController {

    @GetMapping("/api/missions")
    public String getMissions() {
        return "List of Missions";
    }
}
