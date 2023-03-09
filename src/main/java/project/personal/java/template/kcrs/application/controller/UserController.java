package project.personal.java.template.kcrs.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import project.personal.java.template.kcrs.domain.entity.UserBasic;
import project.personal.java.template.kcrs.services.ports.UserServicesInterface;

import java.util.List;

@Controller
@RequestMapping( value ="/data/user")
public class UserController {
    @Autowired
    UserServicesInterface userServicesInterface;

    @GetMapping(value = "/")
    public @ResponseBody List<UserBasic> getAllUsers(){return  userServicesInterface.getAllUsers();}



}
