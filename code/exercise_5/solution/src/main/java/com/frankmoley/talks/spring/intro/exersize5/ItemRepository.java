package com.frankmoley.talks.spring.intro.exersize5;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for managing {@link ItemEntity} objects in the datastore
 */
@Repository
public interface ItemRepository extends CrudRepository<ItemEntity, Long>{

    List<ItemEntity> findByPersonId(long personId);
}
