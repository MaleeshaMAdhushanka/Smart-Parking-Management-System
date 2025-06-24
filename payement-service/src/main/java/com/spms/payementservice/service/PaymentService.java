package com.spms.payementservice.service;

import com.spms.payementservice.entity.Payment;
import com.spms.payementservice.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentService {

    @Autowired
    public PaymentRepo repo;

    public Payment process(Payment p) {
        p.setStatus("SUCCESS");
        p.setTimestamp(LocalDateTime.now());
        return repo.save(p);
    }

    public Payment update(Long id, Payment updated) {
        return repo.findById(id)
                .map(payment -> {
                    payment.setAmount(updated.getAmount());
                    payment.setStatus(updated.getStatus());
                    payment.setTimestamp(LocalDateTime.now());
                    return repo.save(payment);
                })
                .orElseThrow(() -> new RuntimeException("Payment not found"));
  }


}
