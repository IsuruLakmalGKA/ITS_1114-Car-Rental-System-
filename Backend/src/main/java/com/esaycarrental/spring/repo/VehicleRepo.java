package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface VehicleRepo extends JpaRepository<Vehicle, String> {

    List<Vehicle> searchVehiclesByStatus(String status);

    long countVehiclesByStatus(String status);

    @Query(value = "SELECT registrationNumber FROM vehicle ORDER BY registrationNumber DESC LIMIT 1", nativeQuery = true)
    String generateVehicleId();
}
