package project.personal.java.template.kcrs.services;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.personal.java.template.kcrs.application.database.repository.UserDbRepository;
import project.personal.java.template.kcrs.domain.entity.UserBasic;
import project.personal.java.template.kcrs.services.ports.UserServicesInterface;

import java.util.List;
@Service
public class UserServices  implements UserServicesInterface {
    @Autowired
    UserDbRepository userDbRepository;

    @Override
    public List<UserBasic> getAllUsers() {
        return userDbRepository.findAll();
    }
}
