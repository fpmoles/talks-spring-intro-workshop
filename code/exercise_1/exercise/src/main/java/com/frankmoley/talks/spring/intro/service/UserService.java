package com.frankmoley.talks.spring.intro.service;

import com.frankmoley.talks.spring.intro.data.repository.PersonRepository;

/**
 * Service offerings for authentication and user interactions.
 */
public class UserService {

    private final PersonRepository personRepository;

    public UserService(PersonRepository personRepository){
        super();
        this.personRepository = personRepository;
    }
}
