package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.Slip_IMGDTO;
import lk.ijse.spring.entity.Slip_IMG;
import lk.ijse.spring.repo.SlipIMGRepo;
import lk.ijse.spring.service.SlipIMGService;
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
public class SlipIMGServiceImpl implements SlipIMGService {

    @Autowired
    SlipIMGRepo slipIMGRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveSlipIMG(Slip_IMGDTO dto) {
        if (!slipIMGRepo.existsById(dto.getSlip_IMG_Id())) {
            slipIMGRepo.save(mapper.map(dto, Slip_IMG.class));
        } else {
            throw new RuntimeException("Slip_IMG Already Exist..!");
        }
    }

    @Override
    public void deleteSlipIMG(String id) {
        if (slipIMGRepo.existsById(id)) {
            slipIMGRepo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Slip_IMG Id.. No Slip_IMG..!");
        }
    }

    @Override
    public void updateSlipIMG(Slip_IMGDTO dto) {
        if (slipIMGRepo.existsById(dto.getSlip_IMG_Id())) {
            slipIMGRepo.save(mapper.map(dto, Slip_IMG.class));
        } else {
            throw new RuntimeException("No Such Slip_IMG To Update..! Please Check the ID..!");
        }
    }

    @Override
    public List<Slip_IMGDTO> getAllSlipIMGs() {
        return mapper.map(slipIMGRepo.findAll(),new TypeToken<List<Slip_IMGDTO>>(){
        }.getType());
    }
}
