// AlertService placeholder
package com.railpulse.service;
import java.util.ArrayList;
import java.util.List;

public class AlertService {
    public List<String> getAlerts(double sensorValue) {
        List<String> alerts = new ArrayList<>();
        if (sensorValue > 80) {
            alerts.add("Risk threshold exceeded!");
        }
        if (sensorValue < 10) {
            alerts.add("Sensor value critically low!");
        }
        // Add more alert logic as needed
        return alerts;
    }
}
