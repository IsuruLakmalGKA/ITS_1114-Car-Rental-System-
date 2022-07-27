package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Admin {

    @Id
    private String id;
    private String name;
    private String address;
    private String phone_number;
    private String nic_number;
    private String email;
    private String password;
}
