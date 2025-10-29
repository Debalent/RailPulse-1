// AuditService for production
package com.railpulse.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.railpulse.model.AuditLog;
import com.railpulse.repository.AuditLogRepository;
import java.util.List;

@Service
public class AuditService {
    @Autowired
    private AuditLogRepository auditLogRepository;

    public void logAction(String action, String user) {
        AuditLog log = new AuditLog();
        log.setTimestamp(System.currentTimeMillis());
        log.setAction(action);
        log.setUser(user);
        auditLogRepository.save(log);
    }

    public List<AuditLog> getLogs() {
        return auditLogRepository.findAll();
    }

    public List<AuditLog> getLogsByUser(String user) {
        return auditLogRepository.findByUser(user);
    }
}
