package com.frankmoley.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Frank Moley
 */
@Repository
public interface PersonRepository  extends CrudRepository<Person, String>{
    //marker
}
