package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RatesDTO;
import lk.ijse.spring.entity.Rates;
import lk.ijse.spring.repo.RateRepo;
import lk.ijse.spring.service.RateService;
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
public class RateServiceImpl implements RateService {

    @Autowired
    RateRepo rateRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveRates(RatesDTO dto) {
        if (!rateRepo.existsById(dto.getRate_Id())) {
            rateRepo.save(mapper.map(dto, Rates.class));
        }else{
            throw new RuntimeException("Rate Already Exist..!");
        }
    }

    @Override
    public void deleteRates(String id) {
        if (rateRepo.existsById(id)) {
            rateRepo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Rate Id.. No Rate..!");
        }
    }


    @Override
    public void updateRates(RatesDTO dto) {
        if (rateRepo.existsById(dto.getRate_Id())) {
            rateRepo.save(mapper.map(dto, Rates.class));
        } else {
            throw new RuntimeException("No Such Rate To Update..! Please Check the ID..!");
        }
    }

    @Override
    public List<RatesDTO> getAllRates() {
        return mapper.map(rateRepo.findAll(),new TypeToken<List<RatesDTO>>(){
        }.getType());
    }
}
