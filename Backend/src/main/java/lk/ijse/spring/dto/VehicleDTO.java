package lk.ijse.spring.dto;

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
public class VehicleDTO {
    private String registration_Number;
    private String colour;
    private int no_Of_Passengers;
    private String transmission_Type;
    private String brand;
    private String status;
    private String fuel_Type;
    private String running_Km;
    private RatesDTO rates;
    private Vehicle_TypeDTO vehicleType;
}
