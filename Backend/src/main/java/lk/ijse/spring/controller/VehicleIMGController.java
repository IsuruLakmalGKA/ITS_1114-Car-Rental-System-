package lk.ijse.spring.controller;

import lk.ijse.spring.dto.Vehicle_IMGDTO;
import lk.ijse.spring.service.VehicleIMGService;
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
@RequestMapping("vehicleImg")
@CrossOrigin
public class VehicleIMGController {
    @Autowired
    VehicleIMGService vehicleIMGService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveVehicleIMG(@RequestBody Vehicle_IMGDTO vehicle_imgdto){
        vehicleIMGService.saveVehicleIMG(vehicle_imgdto);
        return new ResponseUtil(200,"Saved",null);
    }
    @DeleteMapping(params={"id"},produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteVehicleIMG(@RequestParam String id){
        vehicleIMGService.deleteVehicleIMG(id);
        return new ResponseUtil(200,"Deleted",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateVehicleIMG(@RequestBody Vehicle_IMGDTO vehicle_imgdto){
        vehicleIMGService.updateVehicleIMG(vehicle_imgdto);
        return new ResponseUtil(200,"Updated",null);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllVehicleIMG(){
        return new ResponseUtil(200,"OK",vehicleIMGService.getAllVehicleIMGs());
    }
}
