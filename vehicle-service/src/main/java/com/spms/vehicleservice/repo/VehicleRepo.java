package com.spms.vehicleservice.repo;

import com.spms.vehicleservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByUserId(String userId);
    List<Vehicle> findByType(String type);
    List<Vehicle> findByInside(boolean inside);
    List<Vehicle> findByUserIdAndType(String userId, String type);
}
