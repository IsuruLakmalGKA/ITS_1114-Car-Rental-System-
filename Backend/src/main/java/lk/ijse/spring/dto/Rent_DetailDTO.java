package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Rent_DetailDTO {
    private String rent_Id;
    private String registration_Number;
    private LocalDate rent_Date;
    private LocalDate return_Date;
    private int kilometers;
    private double rental_Cost;
    private double damage_Cost;
    private String status;
}
