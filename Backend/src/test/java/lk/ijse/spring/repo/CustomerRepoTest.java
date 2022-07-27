package lk.ijse.spring.repo;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/


@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;

    @Test
    public void saveCustomer(){

        Customer customer1 = new Customer("C001", "Isuru", "Mathugama", "071", "B49", "9924v", "Isuru@gmail.com", "1234wer");
        Customer customer2 = new Customer("C002", "Isuu", "Mathgama", "07", "B9", "992v", "Isuu@gmail.com", "134wer");
        Customer customer3 = new Customer("C003", "Isur", "Mathgama", "01", "B4", "9924", "Isur@gmail.com", "123wer");
        customerRepo.save(customer1);
        customerRepo.save(customer2);
        customerRepo.save(customer3);
    }

    @Test
    public void getAllCustomers(){
        List<Customer> all = customerRepo.findAll();
        for (Customer customer : all){
            System.out.println(customer.toString());

        }
    }

    @Test
    public void searchCustomer(){
        Optional<Customer> optional = customerRepo.findById("C003");
        boolean present = optional.isPresent();
        System.out.println(present);

        Customer customer = optional.get();
        System.out.println(customer.toString());
    }

    @Test
    public void deleteCustomer(){
        customerRepo.deleteById("C002");

    }
    @Test
    public void updateCustomer(){
        Customer customer3 = new Customer("C003", "Isurlakmal", "Kaluthara", "01", "B4", "9924", "Isur@gmail.com", "123wer");
        customerRepo.save(customer3);
    }

    @Test
    public void tstDTO(){

    }

    @Test
    public void searchCustomerByName(){
        Customer isuru = customerRepo.findCustomerByName("Isuru");
        System.out.println(isuru.toString());
    }

}