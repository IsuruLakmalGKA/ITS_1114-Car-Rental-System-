package lk.ijse.spring.controller;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.AdminService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@RestController
@RequestMapping("admin")
@CrossOrigin
public class AdminContoller {

    @Autowired
    AdminService adminService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveAdmin(@ModelAttribute AdminDTO admin){
        adminService.saveAdmin(admin);
        return new ResponseUtil(200,"Saved",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateAdmin(@RequestBody AdminDTO admin){
        adminService.updateAdmin(admin);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteAdmin(@RequestParam String id){
        adminService.deleteAdmin(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchAdmin(@PathVariable String id){
        return new ResponseUtil(200,"Deleted",adminService.searchAdmin(id));

    }
}
