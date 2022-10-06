package com.esaycarrental.spring.service;

import com.esaycarrental.spring.dto.StaffDTO;
import com.esaycarrental.spring.entity.Staff;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface StaffService {

    void saveStaff(StaffDTO staffDTO);

    void deleteStaff(String staffId);

    void updateStaff(StaffDTO staffDTO);

    List<StaffDTO> getAllStaffs();

    String generateStaffId();
}
