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
public class RatesDTO {
    private String rate_Id;
    private double daily_Rate;
    private double monthly_rate;
    private int free_Km_Day;
    private int free_Km_Month;
    private double extra_Km_Price;
}
