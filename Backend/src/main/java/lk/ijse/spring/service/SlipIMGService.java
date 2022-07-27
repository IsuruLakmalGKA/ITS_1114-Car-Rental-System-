package lk.ijse.spring.service;

import lk.ijse.spring.dto.Slip_IMGDTO;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface SlipIMGService {
    void saveSlipIMG(Slip_IMGDTO dto);

    void deleteSlipIMG(String id);

    void updateSlipIMG(Slip_IMGDTO dto);

    List<Slip_IMGDTO> getAllSlipIMGs();
}
