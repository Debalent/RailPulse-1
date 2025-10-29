// EquipmentController for production map data
package com.railpulse.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

@RestController
public class EquipmentController {
    @GetMapping("/api/equipment-locations")
    public List<Map<String, Object>> getEquipmentLocations() {
        // TODO: Fetch real equipment locations from DB or external API
        return Arrays.asList(
            new HashMap<String, Object>() {{
                put("id", "EQ001"); put("lat", 34.0522); put("lng", -118.2437); put("status", "Active");
            }},
            new HashMap<String, Object>() {{
                put("id", "EQ002"); put("lat", 40.7128); put("lng", -74.0060); put("status", "Idle");
            }}
        );
    }
}
