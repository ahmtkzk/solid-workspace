package com.ahmtkzk.solidtest.singleresponsibility.controller;

import com.ahmtkzk.solidtest.singleresponsibility.service.EmailService;
import com.ahmtkzk.solidtest.singleresponsibility.service.ReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    private final EmailService emailService;
    private final ReportService reportService;

    public ReportController(EmailService emailService, ReportService reportService) {
        this.emailService = emailService;
        this.reportService = reportService;
    }

    @GetMapping("/report/send")
    public ResponseEntity<String> generateAndSendReport(){
        reportService.generateReport();
        emailService.sendEmail();
        return ResponseEntity.ok("OK");
    }

}
