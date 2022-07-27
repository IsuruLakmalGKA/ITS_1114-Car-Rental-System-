package lk.ijse.spring.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
public class Vehicle_IMG {
    @Id
    private String img_Id;
    private String description;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "registration_Number",referencedColumnName = "registration_Number",nullable = false)
    private Vehicle vehicle;

}
