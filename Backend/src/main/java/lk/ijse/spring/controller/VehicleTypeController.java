package lk.ijse.spring.controller;

import lk.ijse.spring.dto.Vehicle_TypeDTO;
import lk.ijse.spring.service.VehicleTypeService;
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
@RequestMapping("vehicleType")
@CrossOrigin
public class VehicleTypeController {
    @Autowired
    VehicleTypeService vehicleTypeService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveVehicleType(@ModelAttribute Vehicle_TypeDTO vehicle_typeDTO){
        vehicleTypeService.saveVehicleType(vehicle_typeDTO);
        return new ResponseUtil(200,"Saved",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteVehicleType(@RequestParam String id){
        vehicleTypeService.deleteVehicleType(id);
        return new ResponseUtil(200,"Deleted",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateVehicleType(@RequestBody Vehicle_TypeDTO vehicleTypeDTO){
        vehicleTypeService.updateVehicleType(vehicleTypeDTO);
        return new ResponseUtil(200,"Updated",null);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllVehicleType(){
        return new ResponseUtil(200,"OK",vehicleTypeService.getAllVehicleType());
    }

}
