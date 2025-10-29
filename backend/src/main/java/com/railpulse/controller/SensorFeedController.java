// SensorFeedController for production
package com.railpulse.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SensorFeedController {
    @GetMapping("/api/sensor-feed")
    public ResponseEntity<Map<String, Object>> getSensorData(@RequestParam(required = false) String sensorId) {
        Map<String, Object> data = new HashMap<>();
        try {
            // TODO: Integrate with real sensor API/IoT platform
            // Example: double value = sensorApi.getValue(sensorId);
            double value = Math.random() * 100; // Simulated value
            data.put("timestamp", System.currentTimeMillis());
            data.put("value", value);
            data.put("sensorId", sensorId);
            return ResponseEntity.ok(data);
        } catch (Exception e) {
            data.put("error", "Failed to fetch sensor data: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(data);
        }
    }
}
