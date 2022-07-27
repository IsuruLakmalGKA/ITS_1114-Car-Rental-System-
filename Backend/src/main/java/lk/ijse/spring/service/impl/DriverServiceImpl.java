package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
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
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveDriver(DriverDTO dto) {
        if (!driverRepo.existsById(dto.getDriver_Id())) {
            driverRepo.save(mapper.map(dto, Driver.class));
        }else{
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void deleteDriver(String id) {
        if (driverRepo.existsById(id)) {
            driverRepo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Driver Id.. No Driver..!");
        }
    }

    @Override
    public void updateDriver(DriverDTO dto) {
        if (driverRepo.existsById(dto.getDriver_Id())) {
            driverRepo.save(mapper.map(dto, Driver.class));
        } else {
            throw new RuntimeException("No Such Driver To Update..! Please Check the ID..!");
        }
    }

    @Override
    public DriverDTO searchDriver(String id) {
        if (driverRepo.existsById(id)) {
            return mapper.map(driverRepo.findById(id).get(), DriverDTO.class);
        } else {
            throw new RuntimeException("No Driver For " + id + " ..!");
        }
    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        return mapper.map(driverRepo.findAll(),new TypeToken<List<DriverDTO>>(){
        }.getType());
    }
}
