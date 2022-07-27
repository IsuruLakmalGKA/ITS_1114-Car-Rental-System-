package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.StaffDTO;
import lk.ijse.spring.entity.Staff;
import lk.ijse.spring.repo.StaffRepo;
import lk.ijse.spring.service.StaffService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@Service
@Transactional
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveStaff(StaffDTO dto) {
        if (!repo.existsById(dto.getStaff_Id())) {
            repo.save(mapper.map(dto, Staff.class));
        }else{
            throw new RuntimeException("Staff Already Exist..!");
        }

    }

    @Override
    public void deleteStaff(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        }else{
            throw new RuntimeException("Please check the Staff Id.. No Staff..!");
        }
    }

    @Override
    public void updateStaff(StaffDTO dto) {
        if (repo.existsById(dto.getStaff_Id())) {
            repo.save(mapper.map(dto, Staff.class));
        }else {
            throw new RuntimeException("No Such Staff To Update..! Please Check the ID..!");
        }
    }

    @Override
    public StaffDTO searchStaff(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(),StaffDTO.class);
        }else{
            throw new RuntimeException("No Staff For " + id + " ..!");
        }

    }

    @Override
    public List<CustomerDTO> getAllStaff() {
        return mapper.map(repo.findAll(),new TypeToken<List<StaffDTO>>(){
        }.getType());
    }
}
