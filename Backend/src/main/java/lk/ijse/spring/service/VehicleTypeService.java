package lk.ijse.spring.service;

import lk.ijse.spring.dto.Vehicle_TypeDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface VehicleTypeService {
    void saveVehicleType(Vehicle_TypeDTO dto);

    void deleteVehicleType(String id);

    void updateVehicleType(Vehicle_TypeDTO dto);

    List<Vehicle_TypeDTO> getAllVehicleType();
}
