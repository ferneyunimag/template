package project.personal.java.template.kcrs.exceptions;

import project.personal.java.template.kcrs.exceptions.http.BadRequestException;

import java.time.ZonedDateTime;

public class InvalidDataException extends BadRequestException {

    public InvalidDataException(String Code, String message, String path, ZonedDateTime timeStamp) {
        super(Code, message, path, timeStamp);
    }
}
