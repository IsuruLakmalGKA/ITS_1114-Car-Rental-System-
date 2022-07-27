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
public class Driver {
    @Id
    private String driver_Id;
    private String name;
    private String address;
    private String type;
    private String mobile_Number;
    private String email;
    private String password;
}
