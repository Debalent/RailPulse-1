// AnalyticsService placeholder
package com.railpulse.service;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsService {
    public Map<String, Object> getAnalytics(double sensorValue) {
        Map<String, Object> analytics = new HashMap<>();
        analytics.put("maintenance", sensorValue > 70 ? "Soon" : "Normal");
        analytics.put("riskScore", sensorValue / 100.0);
        analytics.put("anomaly", sensorValue < 5 || sensorValue > 95);
        return analytics;
    }
}
