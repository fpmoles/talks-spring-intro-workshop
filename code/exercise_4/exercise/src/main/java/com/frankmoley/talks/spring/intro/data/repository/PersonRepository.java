package com.frankmoley.talks.spring.intro.data.repository;

import com.frankmoley.talks.spring.intro.data.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for managing {@link com.frankmoley.talks.spring.intro.data.entity.PersonEntity} objects in the datastore
 */
@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long>{
}
