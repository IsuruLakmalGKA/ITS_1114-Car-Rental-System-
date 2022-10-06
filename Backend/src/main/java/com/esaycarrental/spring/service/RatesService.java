package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.RatesDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface RatesService {
    void saveRates(RatesDTO ratesDTO);

    void deleteRates(String rateID);

    void updateRates(RatesDTO ratesDTO);

    List<RatesDTO> getAllRates();

    String generateRatesId();
}
