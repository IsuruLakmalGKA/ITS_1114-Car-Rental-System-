package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.Rates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface RatesRepo extends JpaRepository<Rates, String> {

    Rates findByRateId(String rateId);

    @Query(value = "SELECT rateId FROM rates ORDER BY rateId DESC LIMIT 1", nativeQuery = true)
    String generateRatesId();
}
