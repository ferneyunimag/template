package project.personal.java.template.kcrs.exceptions.http;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import project.personal.java.template.kcrs.exceptions.GeneralException;

import java.time.ZonedDateTime;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends GeneralException {
    public UnauthorizedException(String Code, String message, String path, ZonedDateTime timeStamp) {
        super(Code, message, path, timeStamp);
    }
}
