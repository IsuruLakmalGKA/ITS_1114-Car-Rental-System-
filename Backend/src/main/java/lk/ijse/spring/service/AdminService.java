package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface AdminService {

    void saveAdmin(AdminDTO dto);
    void deleteAdmin(String id);
    void updateAdmin(AdminDTO dto);
    AdminDTO searchAdmin(String id);
}
