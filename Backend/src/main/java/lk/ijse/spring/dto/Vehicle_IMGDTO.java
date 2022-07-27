package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Vehicle_IMGDTO {
    private String img_Id;
    private String description;
    private Vehicle vehicle;
}
