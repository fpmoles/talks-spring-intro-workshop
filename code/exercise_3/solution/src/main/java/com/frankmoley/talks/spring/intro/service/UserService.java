package com.frankmoley.talks.spring.intro.service;

import com.frankmoley.talks.spring.intro.aspect.Loggable;
import com.frankmoley.talks.spring.intro.data.repository.PersonRepository;
import com.frankmoley.talks.spring.intro.service.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Service offerings for authentication and user interactions.
 */
@Service
public class UserService {

    private final PersonRepository personRepository;

    @Autowired
    public UserService(PersonRepository personRepository){
        super();
        this.personRepository = personRepository;
    }

    @Loggable
    public User getUser(String emailAddress){
        User user = new User();
        user.setUsername("BigLebowski");
        user.setPersonId(UUID.randomUUID().toString());
        return user;
    }
}
