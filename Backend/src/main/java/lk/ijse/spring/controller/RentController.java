package lk.ijse.spring.controller;

import lk.ijse.spring.dto.RentDTO;
import lk.ijse.spring.service.RentService;
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
@RequestMapping("rent")
@CrossOrigin
public class RentController {
    @Autowired
    RentService rentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveRent(@RequestBody RentDTO rentDTO){
        rentService.saveRent(rentDTO);
        return new ResponseUtil(200,"Saved",null);
    }
    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteRent(@RequestParam String id){
        rentService.deleteRent(id);
        return new ResponseUtil(200,"Deleted",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateRent(@RequestBody RentDTO rentDTO){
        rentService.updateRent(rentDTO);
        return new ResponseUtil(200,"Updated",null);
    }
    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchRent(@PathVariable String id){
        return new ResponseUtil(200,"OK",rentService.searchRent(id));
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllRents(){
        return new ResponseUtil(200,"OK",rentService.getAllRents());
    }
}
