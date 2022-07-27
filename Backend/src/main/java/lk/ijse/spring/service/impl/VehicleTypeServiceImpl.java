package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.Vehicle_TypeDTO;
import lk.ijse.spring.entity.Vehicle_Type;
import lk.ijse.spring.repo.Vehicle_TypeRepo;
import lk.ijse.spring.service.VehicleTypeService;
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
public class VehicleTypeServiceImpl implements VehicleTypeService {

    @Autowired
    private Vehicle_TypeRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveVehicleType(Vehicle_TypeDTO dto) {
        if (!repo.existsById(dto.getVehicle_Type_Id())) {
            repo.save(mapper.map(dto, Vehicle_Type.class));
        }else{
            throw new RuntimeException("Vehicle_Type Already Exists...!");
        }
    }

    @Override
    public void deleteVehicleType(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        }else{
            throw new RuntimeException("Please check theVehicle Type Id.. No Vehicle Type..!");
        }
    }

    @Override
    public void updateVehicleType(Vehicle_TypeDTO dto) {
        if (repo.existsById(dto.getVehicle_Type_Id())) {
            repo.save(mapper.map(dto,Vehicle_Type.class));
        }else{
            throw new RuntimeException("No Such Vehicle Type to update..! Please check the Id..!");
        }
    }

    @Override
    public List<Vehicle_TypeDTO> getAllVehicleType() {

        return mapper.map(repo.findAll(),new TypeToken<List<Vehicle_TypeDTO>>(){
        }.getType());
    }
}
