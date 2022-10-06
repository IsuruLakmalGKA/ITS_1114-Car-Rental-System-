package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.VehicleTypeDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface VehicleTypeService {
    void saveVehicleType(VehicleTypeDTO typeDTO);

    void deleteVehicleType(String typeId);

    void updateVehicleType(VehicleTypeDTO typeDTO);

    List<VehicleTypeDTO> getAllVehicleType();

    String generateVehicleTypeId();
}
