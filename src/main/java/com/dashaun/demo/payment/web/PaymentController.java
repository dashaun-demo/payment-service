package com.dashaun.demo.payment.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping({"/api/payments/next", "/api/payments/next/"})
    public String next() {
        return "{\"policyNumber\":\"PL-40012\",\"amount\":184.50,"
                + "\"dueDate\":\"2026-11-01\",\"autopay\":true}";
    }

    @GetMapping({"/api/payments/history", "/api/payments/history/"})
    public String history() {
        return "[{\"date\":\"2026-10-01\",\"amount\":184.50,\"status\":\"PAID\"},"
                + "{\"date\":\"2026-09-01\",\"amount\":184.50,\"status\":\"PAID\"},"
                + "{\"date\":\"2026-08-01\",\"amount\":184.50,\"status\":\"PAID\"}]";
    }
}
