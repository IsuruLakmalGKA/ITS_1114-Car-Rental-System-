package com.esaycarrental.spring.dto;

import com.esaycarrental.spring.entity.CarImg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class VehicleDTO {
    private String registrationNumber;
    private String brand;
    private String color;
    private String status;
    private int noOfPassengers;
    private double runningKm;
    private String fuelType;
    private String transmissionType;
    private VehicleTypeDTO type;
    private RatesDTO rates;
    private List<CarImgDTO> imgs;
}
