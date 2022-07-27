package lk.ijse.spring.controller;

import lk.ijse.spring.dto.RatesDTO;
import lk.ijse.spring.service.RateService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@RestController
@RequestMapping("rates")
@CrossOrigin
public class RateSController {

    @Autowired
    RateService rateService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveRate(@ModelAttribute RatesDTO ratesDTO) {
        rateService.saveRates(ratesDTO);
        return new ResponseUtil(200, "Saved", null);
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteRate(@RequestParam String id) {
        rateService.deleteRates(id);
        return new ResponseUtil(200, "Deleted", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody RatesDTO ratesDTO) {
        rateService.updateRates(ratesDTO);
        return new ResponseUtil(200, "Updated", null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCustomers() {
        return new ResponseUtil(200, "OK", rateService.getAllRates());
    }
}
