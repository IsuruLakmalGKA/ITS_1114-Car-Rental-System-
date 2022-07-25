package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Isuru Lakmal G K A
 * Date    : $(DATE)
 **/

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getAllCustomers(){
        return new CustomerDTO("C001","Isuru","Mathugama","0715666895","B4900439","992491183v","Isuru@gmail.com","1234isuru");
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO searchCustomer(){
        return new CustomerDTO("C002","Isuru","Mathugama","0715666895","B4900439","992491183v","Isuru@gmail.com","1234isuru");
    }
}
