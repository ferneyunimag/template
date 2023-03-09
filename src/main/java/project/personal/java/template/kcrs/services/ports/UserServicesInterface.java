package project.personal.java.template.kcrs.services.ports;

import org.springframework.stereotype.Repository;
import project.personal.java.template.kcrs.domain.entity.UserBasic;

import java.util.List;
@Repository
public interface UserServicesInterface {
    List<UserBasic> getAllUsers();
}
