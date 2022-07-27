package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface StaffRepo extends JpaRepository<Staff,String> {
}
