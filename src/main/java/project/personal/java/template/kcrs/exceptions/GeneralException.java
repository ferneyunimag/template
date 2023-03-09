package project.personal.java.template.kcrs.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class GeneralException extends RuntimeException {

    private String Code;
    private String message;
    private String path;
    private ZonedDateTime timeStamp;


}
