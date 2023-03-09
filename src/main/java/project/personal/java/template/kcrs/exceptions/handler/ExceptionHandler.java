package project.personal.java.template.kcrs.exceptions.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import project.personal.java.template.kcrs.exceptions.http.BadRequestException;
import project.personal.java.template.kcrs.exceptions.http.UnauthorizedException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler({BadRequestException.class})
    @ResponseBody
    public ResponseEntity<ErrorMessage> badRequest(BadRequestException e) {
        ErrorMessage errorMessage = new ErrorMessage(e, "jak", HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler({UnauthorizedException.class})
    @ResponseBody
    public ResponseEntity<ErrorMessage> Unauthorized(UnauthorizedException e) {
        ErrorMessage errorMessage = new ErrorMessage(e, "", HttpStatus.UNAUTHORIZED.value());
        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.UNAUTHORIZED);

    }

}
