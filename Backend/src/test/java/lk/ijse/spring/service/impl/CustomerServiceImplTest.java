package lk.ijse.spring.service.impl;

import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    public void addTestCustomer(){
        CustomerDTO c1 = new CustomerDTO("C001", "Isuru", "Mathugama", "0876", "45645g", "9924", "fdghfgh", "35y3rh");
        CustomerDTO c2 = new CustomerDTO("C002", "Isuru", "Mathugama", "0876", "45645g", "9924", "fdghfgh", "35y3rh");
        CustomerDTO c3 = new CustomerDTO("C003", "Isuru", "Mathugama", "0876", "45645g", "9924", "fdghfgh", "35y3rh");
        CustomerDTO c4 = new CustomerDTO("C004", "Isuru", "Mathugama", "0876", "45645g", "9924", "fdghfgh", "35y3rh");
        customerService.saveCustomer(c1);
        customerService.saveCustomer(c2);
        customerService.saveCustomer(c3);
        customerService.saveCustomer(c4);
    }

    @Test
    void saveCustomer() {
        assertDoesNotThrow(()->{
            addTestCustomer();
        });


        CustomerDTO customerDTO2 = new CustomerDTO("C001", "Isuru", "Mathugama", "0876", "45645g", "9924", "fdghfgh", "35y3rh");
        assertThrows(RuntimeException.class,()->{
            customerService.saveCustomer(customerDTO2);
        });
    }

    @Test
    void deleteCustomer() {
        addTestCustomer();
        assertDoesNotThrow(()->{
            customerService.deleteCustomer("C001");
        });

        assertThrows(RuntimeException.class,()->{
            customerService.deleteCustomer("C001");
        });

    }

    @Test
    void updateCustomer() {
        addTestCustomer();
        assertDoesNotThrow(()->{
            customerService.updateCustomer(new CustomerDTO("C001","wert","ert","dfg","qrtt","ertet","fg","345"));
        });

        assertThrows(RuntimeException.class,()->{
            customerService.updateCustomer(new CustomerDTO("C005","wert","ert","dfg","qrtt","ertet","fg","345"));
        });
    }

    @Test
    void searchCustomer() {
        addTestCustomer();
        assertNotNull(customerService.searchCustomer("C001"));

        assertThrows(RuntimeException.class,()->{
            customerService.searchCustomer("C005");
        });
    }

    @Test
    void getAllCustomers() {
        addTestCustomer();
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        for (CustomerDTO allCustomer : allCustomers){
            System.out.println(allCustomer.toString());
        }
        assertNotNull(allCustomers);
    }
}