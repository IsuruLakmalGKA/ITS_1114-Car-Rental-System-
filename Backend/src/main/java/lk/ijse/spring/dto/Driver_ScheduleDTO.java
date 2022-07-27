package lk.ijse.spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Driver_ScheduleDTO {
    private String registration_Number;
    private String rent_Id;
    private String driver_Id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate rent_Date;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate return_Date;
}
