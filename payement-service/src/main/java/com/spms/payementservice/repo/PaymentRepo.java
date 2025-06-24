package com.spms.payementservice.repo;

import com.spms.payementservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {

    Payment findByUserId(String userId);
    Payment findByVehicleId(String vehicleId);
//    Payment findByUserIdAndVehicleId(String userId, String vehicleId);
//    Payment findByUserIdAndVehicleIdAndStatus(String userId, String vehicleId, String status);



}
