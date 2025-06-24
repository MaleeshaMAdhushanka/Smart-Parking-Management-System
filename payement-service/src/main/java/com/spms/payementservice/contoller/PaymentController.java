package com.spms.payementservice.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    @GetMapping("/status")
    public String getPaymentStatus() {
        return "Payment Service is running";
    }
}
