package lk.ijse.spring.service;

import lk.ijse.spring.dto.RatesDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface RateService {
    void saveRates(RatesDTO dto);

    void deleteRates(String id);

    void updateRates(RatesDTO dto);

    List<RatesDTO> getAllRates();
}
