// ReportController for production report download
package com.railpulse.controller;
import com.railpulse.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/api/report/csv")
    public ResponseEntity<String> downloadCSVReport() {
        String csv = String.join("\n", reportService.generateCSVReport());
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=report.csv");
        return ResponseEntity.ok().headers(headers).contentType(MediaType.TEXT_PLAIN).body(csv);
    }

    @GetMapping("/api/report/pdf")
    public ResponseEntity<byte[]> downloadPDFReport() {
        byte[] pdf = reportService.generatePDFReport();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=report.pdf");
        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(pdf);
    }
}
