package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RentDTO;
import lk.ijse.spring.entity.Rent;
import lk.ijse.spring.repo.RentRepo;
import lk.ijse.spring.service.RentService;
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
public class RentServiceImpl implements RentService {
    @Autowired
    RentRepo rentRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveRent(RentDTO dto) {
        if (!rentRepo.existsById(dto.getRent_Id())) {
            rentRepo.save(mapper.map(dto, Rent.class));
        } else {
            throw new RuntimeException("Rent Already Exist..!");
        }
    }

    @Override
    public void deleteRent(String id) {
        if (rentRepo.existsById(id)) {
            rentRepo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Rent Id.. No Rent..!");
        }
    }

    @Override
    public void updateRent(RentDTO dto) {
        if (rentRepo.existsById(dto.getRent_Id())) {
            rentRepo.save(mapper.map(dto, Rent.class));
        } else {
            throw new RuntimeException("No Such Rent To Update..! Please Check the Rent ID..!");
        }
    }

    @Override
    public RentDTO searchRent(String id) {
        if (rentRepo.existsById(id)) {
            return mapper.map(rentRepo.findById(id).get(), RentDTO.class);
        } else {
            throw new RuntimeException("No Rent For " + id + " ..!");
        }
    }

    @Override
    public List<RentDTO> getAllRents() {
        return mapper.map(rentRepo.findAll(), new TypeToken<List<RentDTO>>() {
        }.getType());
    }
}
