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
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private String phone_number;
    private String driving_License_Number;
    private String nic_number;
    private String email;
    private String password;

}
