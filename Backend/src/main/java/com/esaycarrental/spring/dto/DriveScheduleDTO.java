package com.esaycarrental.spring.dto;

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
public class DriveScheduleDTO {
    private String registrationNumber;
    private String rentId;
    private String driverId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate checking;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;
}
