package project.personal.java.template.kcrs.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import project.personal.java.template.kcrs.application.database.repository.UserDbRepository;
import project.personal.java.template.kcrs.domain.entity.UserBasic;
import project.personal.java.template.kcrs.exceptions.InvalidDataException;
import project.personal.java.template.kcrs.exceptions.http.BadRequestException;
import project.personal.java.template.kcrs.services.ports.UserServicesInterface;


import java.time.ZonedDateTime;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserServices implements UserServicesInterface {
    @Autowired
    UserDbRepository userDbRepository;

    @Override
    public List<UserBasic> getAllUsers() {
        if (1 == 1) {
            throw new InvalidDataException("1", "invalidDataException ", "lo que sea", ZonedDateTime.now());
        }
        return userDbRepository.findAll();
    }
}
