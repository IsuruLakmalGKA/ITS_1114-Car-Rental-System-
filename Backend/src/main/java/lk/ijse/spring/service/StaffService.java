package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.StaffDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface StaffService {
    void saveStaff(StaffDTO dto);
    void deleteStaff(String id);
    void updateStaff(StaffDTO dto);
    StaffDTO searchStaff(String id);
    List<CustomerDTO> getAllStaff();
}
