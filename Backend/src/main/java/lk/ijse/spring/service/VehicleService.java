package lk.ijse.spring.service;

import lk.ijse.spring.dto.VehicleDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface VehicleService {
    void saveVehicle(VehicleDTO dto);

    void deleteVehicle(String id);

    void updateVehicle(VehicleDTO dto);

    VehicleDTO searchVehicle(String id);

    List<VehicleDTO> getAllVehicles();
}
