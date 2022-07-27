package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.Vehicle_IMGDTO;
import lk.ijse.spring.entity.Vehicle_IMG;
import lk.ijse.spring.repo.VehicleIMGRepo;
import lk.ijse.spring.service.VehicleIMGService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@Service
@Transactional
public class VehicleIMGServiceImpl implements VehicleIMGService {
    @Autowired
    private VehicleIMGRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveVehicleIMG(Vehicle_IMGDTO dto) {
        if (!repo.existsById(dto.getImg_Id())) {
            repo.save(mapper.map(dto, Vehicle_IMG.class));
        } else {
            throw new RuntimeException("Vehicle_IMG Already Exist..!");
        }
    }

    @Override
    public void deleteVehicleIMG(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Vehicle_IMG Id.. No Vehicle_IMG..!");
        }
    }

    @Override
    public void updateVehicleIMG(Vehicle_IMGDTO dto) {
        if (repo.existsById(dto.getImg_Id())) {
            repo.save(mapper.map(dto, Vehicle_IMG.class));
        } else {
            throw new RuntimeException("No Such Vehicle_IMG To Update..! Please Check the ID..!");
        }
    }

    @Override
    public List<Vehicle_IMGDTO> getAllVehicleIMGs() {
        return mapper.map(repo.findAll(),new TypeToken<List<Vehicle_IMGDTO>>(){
        }.getType());

    }
}
