package lk.ijse.spring.controller;

import lk.ijse.spring.dto.Slip_IMGDTO;
import lk.ijse.spring.service.SlipIMGService;
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
@RequestMapping("slipImg")
@CrossOrigin
public class SlipIMGController {

    @Autowired
    SlipIMGService slipIMGService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveSlipImg(@ModelAttribute Slip_IMGDTO slip_imgdto){
        slipIMGService.saveSlipIMG(slip_imgdto);
        return new ResponseUtil(200,"Saved",null);
    }
    @DeleteMapping(params={"id"},produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteSlipImg(@RequestParam String id){
        slipIMGService.deleteSlipIMG(id);
        return new ResponseUtil(200,"Deleted",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateSlipImg(@RequestBody Slip_IMGDTO slip_imgdto){
        slipIMGService.updateSlipIMG(slip_imgdto);
        return new ResponseUtil(200,"Updated",null);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllSlipImg(){
        return new ResponseUtil(200,"OK",slipIMGService.getAllSlipIMGs());
    }
}
