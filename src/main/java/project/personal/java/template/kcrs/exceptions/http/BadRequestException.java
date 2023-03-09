package project.personal.java.template.kcrs.exceptions.http;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import project.personal.java.template.kcrs.exceptions.GeneralException;

import java.time.ZonedDateTime;

public class BadRequestException extends GeneralException {

    public BadRequestException(String Code, String message, String path, ZonedDateTime timeStamp) {
        super(Code, message, path, timeStamp);
    }
}
