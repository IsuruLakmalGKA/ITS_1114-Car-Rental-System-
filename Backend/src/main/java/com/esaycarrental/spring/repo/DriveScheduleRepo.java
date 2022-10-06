package com.esaycarrental.spring.repo;

import com.esaycarrental.spring.entity.DriveSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface DriveScheduleRepo extends JpaRepository<DriveSchedule,String> {
}
