package lk.ijse.spring.controller;

import lk.ijse.spring.dto.VehicleDTO;
import lk.ijse.spring.service.VehicleService;
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
@RequestMapping("vehicle")
@CrossOrigin
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveVehicle(@RequestBody VehicleDTO vehicleDTO){
        vehicleService.saveVehicle(vehicleDTO);
        return new ResponseUtil(200,"Saved",null);
    }
    @DeleteMapping(params={"id"},produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteVehicle(@RequestParam String id){
        vehicleService.deleteVehicle(id);
        return new ResponseUtil(200,"Deleted",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody VehicleDTO vehicleDTO){
        vehicleService.updateVehicle(vehicleDTO);
        return new ResponseUtil(200,"Updated",null);
    }
    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchVehicle(@PathVariable String id){
        return new ResponseUtil(200,"OK",vehicleService.searchVehicle(id));
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllVehicles(){
        return new ResponseUtil(200,"OK",vehicleService.getAllVehicles());
    }
}
