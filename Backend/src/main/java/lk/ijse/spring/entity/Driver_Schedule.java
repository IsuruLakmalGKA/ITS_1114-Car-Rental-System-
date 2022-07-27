package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
@IdClass(Drive_Schedule_PK.class)
public class Driver_Schedule {
    @Id
    private String driver_Id;
    @Id
    private String registration_Number;
    @Id
    private String rent_Id;
    private LocalDate rent_Date;
    private LocalDate return_Date;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "driver_Id",referencedColumnName = "driver_Id",nullable = false,insertable = false,updatable = false)
    private Driver driver;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "registration_Number",referencedColumnName = "registration_Number",nullable = false,insertable = false,updatable = false)
    private Vehicle vehicle;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "rent_Id",referencedColumnName = "rent_Id",nullable = false,insertable = false,updatable = false)
    private Rent rent;
}
