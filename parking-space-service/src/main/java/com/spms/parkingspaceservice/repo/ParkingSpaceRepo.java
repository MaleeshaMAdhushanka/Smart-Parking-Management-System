package com.spms.parkingspaceservice.repo;

import com.spms.parkingspaceservice.entity.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingSpaceRepo extends JpaRepository<ParkingSpace, Long> {

    List<ParkingSpace> findByAvailableTrue();

    List<ParkingSpace> findByLocation(String location);

    List<ParkingSpace> findByAvailable(boolean available);

    List<ParkingSpace> findByLocationAndAvailable(String location, boolean available);

}
