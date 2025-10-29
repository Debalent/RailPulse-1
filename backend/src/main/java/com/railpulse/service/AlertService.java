// AlertService for production
package com.railpulse.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AlertService {
    @Autowired
    private NotificationService notificationService;

    public List<String> getAlerts(double sensorValue, String userEmail, String userPhone) {
        List<String> alerts = new ArrayList<>();
        if (sensorValue > 80) {
            String msg = "Risk threshold exceeded!";
            alerts.add(msg);
            notificationService.sendEmail(userEmail, "Sensor Alert", msg);
            notificationService.sendSMS(userPhone, msg);
        }
        if (sensorValue < 10) {
            String msg = "Sensor value critically low!";
            alerts.add(msg);
            notificationService.sendEmail(userEmail, "Sensor Alert", msg);
            notificationService.sendSMS(userPhone, msg);
        }
        // Add more alert logic as needed
        return alerts;
    }
}
