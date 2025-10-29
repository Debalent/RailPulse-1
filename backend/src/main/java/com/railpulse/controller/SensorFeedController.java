// SensorFeedController placeholder
package com.railpulse.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SensorFeedController {
    @GetMapping("/api/sensor-feed")
    public Map<String, Object> getSensorData() {
        Map<String, Object> data = new HashMap<>();
        data.put("timestamp", System.currentTimeMillis());
        data.put("value", new Random().nextDouble() * 100);
        return data;
    }
}
