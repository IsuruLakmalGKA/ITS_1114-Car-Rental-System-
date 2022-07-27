package lk.ijse.spring.service;

import lk.ijse.spring.dto.Vehicle_IMGDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface VehicleIMGService {
    void saveVehicleIMG(Vehicle_IMGDTO dto);

    void deleteVehicleIMG(String id);

    void updateVehicleIMG(Vehicle_IMGDTO dto);

    List<Vehicle_IMGDTO> getAllVehicleIMGs();
}
