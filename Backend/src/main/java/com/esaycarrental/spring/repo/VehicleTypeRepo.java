package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface VehicleTypeRepo extends JpaRepository<VehicleType, String> {

    VehicleType findByVehicleTypeId(String vehicleId);

    @Query(value = "SELECT vehicleTypeId FROM vehicletype ORDER BY vehicleTypeId DESC LIMIT 1", nativeQuery = true)
    String generateVehicleTypeId();
}
