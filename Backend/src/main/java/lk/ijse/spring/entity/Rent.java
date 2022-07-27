package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
public class Rent {
    @Id
    private String rent_Id;
    private LocalDate date;
    private String status;
    private String reason;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "id",referencedColumnName = "id",nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "rent",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<Rent_Detail> rent_details;

    @OneToMany(mappedBy = "rent",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<Driver_Schedule> driver_schedules;
}
