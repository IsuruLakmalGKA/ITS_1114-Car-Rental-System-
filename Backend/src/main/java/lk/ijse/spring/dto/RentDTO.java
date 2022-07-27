package lk.ijse.spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class RentDTO {
    private String rent_Id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String status;
    private String reason;
    private CustomerDTO customer;
    private List<Rent_DetailDTO> rent_details;
    private List<Driver_ScheduleDTO> driver_schedules;
}
