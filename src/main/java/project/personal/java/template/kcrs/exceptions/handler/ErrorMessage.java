package project.personal.java.template.kcrs.exceptions.handler;

import lombok.Getter;
import lombok.ToString;
import project.personal.java.template.kcrs.exceptions.GeneralException;

@ToString
@Getter
public class ErrorMessage {
    private String code;
    private String exception;
    private String message;
    private String path;
    private String timeStamp;

    public ErrorMessage(GeneralException e, String path){
        this.code=e.getCode();
        this.exception= e.getClass().getName();
        this.message=e.getMessage();
        this.path=path;
        this.timeStamp= e.getTimeStamp().toString();
    }

}
