package com.esaycarrental.spring.dto;

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
public class StaffDTO {
    private String staffId;
    private String name;
    private String address;
    private String mobileNo;
    private String type;
    private String email;
    private String password;
}
