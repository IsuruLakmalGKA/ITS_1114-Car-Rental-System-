package lk.ijse.spring.controller;

import lk.ijse.spring.dto.StaffDTO;
import lk.ijse.spring.service.StaffService;
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
@RequestMapping("staff")
@CrossOrigin
public class StaffController {
    @Autowired
    StaffService staffService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveStaff(@ModelAttribute StaffDTO staffDTO) {
        staffService.saveStaff(staffDTO);
        return new ResponseUtil(200, "Saved", null);
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteStaff(@RequestParam String id) {
        staffService.deleteStaff(id);
        return new ResponseUtil(200, "Deleted", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateStaff(@RequestBody StaffDTO dto) {
        staffService.updateStaff(dto);
        return new ResponseUtil(200, "Updated", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchStaff(@PathVariable String id) {
        return new ResponseUtil(200, "OK", staffService.searchStaff(id));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllStaff() {
        return new ResponseUtil(200, "OK", staffService.getAllStaff());
    }
}
