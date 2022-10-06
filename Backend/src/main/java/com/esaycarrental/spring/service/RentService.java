package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.RentDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface RentService {

    void saveRent(RentDTO rentDTO);

    void deleteRent(String rentId);

    void updateRent(RentDTO rentDTO);

    List<RentDTO> getAllRents();

}
