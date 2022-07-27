package lk.ijse.spring.service;

import lk.ijse.spring.dto.RentDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface RentService {
    void saveRent(RentDTO dto);

    void deleteRent(String id);

    void updateRent(RentDTO dto);

    RentDTO searchRent(String id);

    List<RentDTO> getAllRents();
}
