package lk.ijse.spring.entity;

import org.springframework.data.jpa.repository.EntityGraph;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Isuru Lakmal G K A
 * Date    : $(DATE)
 **/

@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private String phone_number;
    private String driving_License_Number;
    private String nic_number;
    private String email;
    private String password;

    public Customer() {
    }

    public Customer(String id, String name, String address, String phone_number, String driving_License_Number, String nic_number, String email, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.driving_License_Number = driving_License_Number;
        this.nic_number = nic_number;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDriving_License_Number() {
        return driving_License_Number;
    }

    public void setDriving_License_Number(String driving_License_Number) {
        this.driving_License_Number = driving_License_Number;
    }

    public String getNic_number() {
        return nic_number;
    }

    public void setNic_number(String nic_number) {
        this.nic_number = nic_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
