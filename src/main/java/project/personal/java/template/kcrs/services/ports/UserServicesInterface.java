package project.personal.java.template.kcrs.services.ports;

import project.personal.java.template.kcrs.domain.entity.UserBasic;

import java.util.List;

public interface UserServicesInterface {
    List<UserBasic> getAllUsers();
}
