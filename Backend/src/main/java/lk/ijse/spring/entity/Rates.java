package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
public class Rates {
    @Id
    private String rate_Id;
    private double daily_Rate;
    private double monthly_rate;
    private int free_Km_Day;
    private int free_Km_Month;
    private double extra_Km_Price;

}
