package lk.ijse.spring.advisor;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@CrossOrigin
@RestControllerAdvice
public class AppWideExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    public ResponseUtil exceptionHandler(Exception e){
        return new ResponseUtil(500,e.getMessage(),null);
    }
}
