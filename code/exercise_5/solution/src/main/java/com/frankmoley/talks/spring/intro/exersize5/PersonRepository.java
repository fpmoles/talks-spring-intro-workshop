package com.frankmoley.talks.spring.intro.exersize5;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for managing {@link PersonEntity} objects in the datastore
 */
@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long>{
}
