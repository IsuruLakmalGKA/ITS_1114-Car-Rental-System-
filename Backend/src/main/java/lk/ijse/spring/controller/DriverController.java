package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.DriverService;
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
@RequestMapping("driver")
@CrossOrigin
public class DriverController {
    @Autowired
    DriverService driverService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveDriver(@ModelAttribute DriverDTO driverDTO){
        driverService.saveDriver(driverDTO);
        return new ResponseUtil(200,"Saved",null);
    }
    @DeleteMapping(params={"id"},produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteDriver(@RequestParam String id){
        driverService.deleteDriver(id);
        return new ResponseUtil(200,"Deleted",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateDriver(@RequestBody DriverDTO driverDTO){
        driverService.updateDriver(driverDTO);
        return new ResponseUtil(200,"Updated",null);
    }
    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchDriver(@PathVariable String id){
        return new ResponseUtil(200,"OK",driverService.searchDriver(id));
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllDrivers(){
        return new ResponseUtil(200,"OK",driverService.getAllDrivers());
    }
}
