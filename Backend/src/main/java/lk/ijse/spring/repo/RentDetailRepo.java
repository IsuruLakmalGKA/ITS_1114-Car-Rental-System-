package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Rent_Detail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface RentDetailRepo extends JpaRepository<Rent_Detail,String> {
}
