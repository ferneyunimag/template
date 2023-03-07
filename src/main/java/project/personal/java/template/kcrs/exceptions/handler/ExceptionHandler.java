package project.personal.java.template.kcrs.exceptions.handler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import project.personal.java.template.kcrs.exceptions.http.BadRequestException;
import project.personal.java.template.kcrs.exceptions.http.UnauthorizedException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler({BadRequestException.class})
    @ResponseBody
    public ErrorMessage badRequest(HttpServletRequest request, BadRequestException e){
        return new ErrorMessage(e,request.getRequestURI());}


    @org.springframework.web.bind.annotation.ExceptionHandler({UnauthorizedException.class})
    @ResponseBody
    public  ErrorMessage Unautorized(HttpServletRequest request, UnauthorizedException e){
        return new ErrorMessage(e, request.getRequestURI());}

}
