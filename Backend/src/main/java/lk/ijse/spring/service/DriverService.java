package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface DriverService {
    void saveDriver(DriverDTO dto);

    void deleteDriver(String id);

    void updateDriver(DriverDTO dto);

    DriverDTO searchDriver(String id);

    List<DriverDTO> getAllDrivers();
}
