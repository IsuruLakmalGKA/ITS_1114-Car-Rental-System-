package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Rates;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface RateRepo extends JpaRepository<Rates,String> {
}
