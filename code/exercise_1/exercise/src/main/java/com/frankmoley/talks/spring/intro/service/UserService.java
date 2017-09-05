package com.frankmoley.talks.spring.intro.service;

import com.frankmoley.talks.spring.intro.data.repository.PersonRepository;

public class UserService {

    private final PersonRepository personRepository;

    public UserService(PersonRepository personRepository){
        super();
        this.personRepository = personRepository;
    }
}
