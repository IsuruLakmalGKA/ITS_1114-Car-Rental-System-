package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface DriverRepo extends JpaRepository<Driver, String> {

    @Query(value = "SELECT driverId FROM driver ORDER BY driverId DESC LIMIT 1", nativeQuery = true)
    String generateDriverId();

}
