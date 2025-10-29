// AuditService placeholder
package com.railpulse.service;
import java.util.ArrayList;
import java.util.List;

public class AuditService {
    private List<String> logs = new ArrayList<>();
    public void logAction(String action) {
        logs.add(System.currentTimeMillis() + ": " + action);
    }
    public List<String> getLogs() {
        return logs;
    }
}
