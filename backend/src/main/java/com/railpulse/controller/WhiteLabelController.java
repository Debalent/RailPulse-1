// WhiteLabelController for production config persistence
package com.railpulse.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/white-label")
public class WhiteLabelController {
    private Map<String, Object> config = new HashMap<>();

    @GetMapping
    public ResponseEntity<Map<String, Object>> getConfig() {
        return ResponseEntity.ok(config);
    }

    @PostMapping
    public ResponseEntity<Void> updateConfig(@RequestBody Map<String, Object> newConfig) {
        config.putAll(newConfig);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
