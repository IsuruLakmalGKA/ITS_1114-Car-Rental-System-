package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@Service
@Transactional
public class AdminImpl implements AdminService {

    @Autowired
    private AdminRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveAdmin(AdminDTO dto) {
        if (!repo.existsById(dto.getId())){
            repo.save(mapper.map(dto, Admin.class));
        }else {
            throw new RuntimeException("Admin Already Exists...");
        }

    }

    @Override
    public void deleteAdmin(String id) {
        if (repo.existsById(id)){
            repo.deleteById(id);
        }else {
            throw new RuntimeException("Please Check the Customer ID...No Such Customer..!");
        }

    }

    @Override
    public void updateAdmin(AdminDTO dto) {
        if (repo.existsById(dto.getId())){
            repo.save(mapper.map(dto,Admin.class));
        }else {
            throw new RuntimeException("No Such Admin to Update...");
        }
    }

    @Override
    public AdminDTO searchAdmin(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), AdminDTO.class);
        }else {
            throw new RuntimeException("No Customer for "+id+" ..!");
        }
    }
}
