// NotificationService for production alerting
package com.railpulse.service;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendEmail(String to, String subject, String body) {
        // TODO: Integrate with real email provider (e.g., SendGrid, SMTP)
        System.out.println("Email sent to " + to + ": " + subject);
    }
    public void sendSMS(String to, String message) {
        // TODO: Integrate with real SMS provider (e.g., Twilio)
        System.out.println("SMS sent to " + to + ": " + message);
    }
}
