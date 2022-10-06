package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.DriverDTO;
import com.esaycarrental.spring.dto.StaffDTO;
import com.esaycarrental.spring.entity.Staff;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface DriverService {

    void saveDriver(DriverDTO driverDTO);

    void deleteDriver(String driverId);

    void updateDriver(DriverDTO driverDTO);

    List<DriverDTO> getAllDrivers();

    String generateDriverId();
}
